package com.sabahtalateh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();

        int vertexNumber = Integer.parseInt(s.split(" ")[0]);
        int edgesNumber = Integer.parseInt(s.split(" ")[1]);

        TreeMap<Integer, ArrayList<Integer>> adjList = new TreeMap<>();

        int[][] edges = new int[edgesNumber][2];

        for (int i = 0; i < vertexNumber; i++) {
            ArrayList<Integer> linkToSelf = new ArrayList<>();
            linkToSelf.add(i + 1);
            adjList.put(i + 1, linkToSelf);
        }

        int edgeCounter = 0;

        for (int i = 0; i < edgesNumber; i++) {
            s = reader.readLine();

            int from = Integer.parseInt(s.split(" ")[0]);
            int to = Integer.parseInt(s.split(" ")[1]);

            ArrayList<Integer> vertsToAddTo = adjList.get(from);
            if (!vertsToAddTo.contains(to)) {
                vertsToAddTo.add(to);
            }

            ArrayList<Integer> vertsToAddFrom = adjList.get(to);
            if (!vertsToAddFrom.contains(from)) {
                vertsToAddFrom.add(from);
            }

            edges[edgeCounter][0] = from;
            edges[edgeCounter][1] = to;

            edgeCounter++;
        }

        if (getRelationComponents(adjList) != 1) {
            System.out.println("NONE");
            return;
        }

        int[] vertexEdgesCount = new int[vertexNumber];

        for (int[] edge : edges) {
            for (int vertex : edge) {
                vertexEdgesCount[vertex - 1]++;
            }
        }

        for (int edgeCount : vertexEdgesCount) {
            if (edgeCount % 2 != 0) {
                System.out.printf("NONE");
                return;
            }
        }

        LinkedList<Integer> stack = new LinkedList<>();
        stack.add(1);

        ArrayList<Integer> answear = new ArrayList<>();

        while (stack.size() != 0) {

            int currVert = stack.getLast();

            int[][] edgeToRemove = getFirstEdgeContainsVertexIndexes(edges, currVert);

            if (edgeToRemove[0][0] == -1) {
                answear.add(stack.getLast());
                stack.removeLast();
            } else {
                if (edges[edgeToRemove[0][0]][edgeToRemove[0][1]] == currVert) {
                    stack.add(edges[edgeToRemove[1][0]][edgeToRemove[1][1]]);
                } else {
                    stack.add(edges[edgeToRemove[0][0]][edgeToRemove[0][1]]);
                }

                removeEdge(edges, edgeToRemove);
            }
        }

        int c = answear.size();

        for (Integer aStack : answear) {
            c--;
            if (c != 0) System.out.print(aStack + " ");
        }
    }

    private static int[][] getFirstEdgeContainsVertexIndexes(int[][] edges, int vertex) {
        int[][] out = new int[2][2];
        out[0][0] = -1;
        out[0][1] = -1;
        out[1][0] = -1;
        out[1][1] = -1;

        label:
        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < edges[i].length; j++) {
                if (edges[i][j] == vertex) {

                    out[0][0] = i;
                    out[0][1] = 0;

                    out[1][0] = i;
                    out[1][1] = 1;

                    break label;
                }
            }
        }

        return out;
    }

    private static int[][] removeEdge(int[][] edges, int[][] edgeToRemove) {
        edges[edgeToRemove[0][0]][edgeToRemove[0][1]] = -1;
        edges[edgeToRemove[1][0]][edgeToRemove[1][1]] = -1;

        return edges;
    }

    private static int getRelationComponents(TreeMap<Integer, ArrayList<Integer>> adjList) {
        LinkedList<Integer> vertexesToFind = new LinkedList<>();

        TreeMap<Integer, Boolean> marks = new TreeMap<>();

        for (int i = 0; i < adjList.size(); i++) {
            marks.put(i + 1, false);
        }

        int components = 0;
        while (hasUnmarkedInWholeGraph(marks)) {
            components++;

            vertexesToFind.add(getFirstUnmarkedInWholeGraph(marks));

            while (true) {

                markVertexAsVisited(vertexesToFind.getFirst(), marks);
                fillVertexToFind(adjList, vertexesToFind.getFirst(), vertexesToFind, marks);
                vertexesToFind.remove(0);

                if (hasVertexesToFind(vertexesToFind)) {
                    continue;
                } else {
                    break;
                }
            }
        }

        return components;
    }

    private static boolean hasUnmarkedAdjacent(TreeMap<Integer, ArrayList<Integer>> adjList, TreeMap<Integer, Boolean> marks, Integer vertexToCheck) {
        for (Integer vertex : adjList.get(vertexToCheck)) {
            if (!marks.get(vertex)) {
                return true;
            }
        }

        return false;
    }

    private static boolean hasUnmarkedInWholeGraph(TreeMap<Integer, Boolean> list) {
        for (Map.Entry<Integer, Boolean> entry : list.entrySet()) {
            if (!entry.getValue()) return true;
        }

        return false;
    }

    private static void fillVertexToFind(
            TreeMap<Integer, ArrayList<Integer>> adjList,
            int vertexIndex,
            LinkedList<Integer> vertexesToFind,
            TreeMap<Integer, Boolean> marks
    ) {
        for (Integer vertex : adjList.get(vertexIndex)) {
            if (!marks.get(vertex) && !vertexesToFind.contains(vertex)) {
                vertexesToFind.add(vertex);
            }
        }
    }

    private static void markVertexAsVisited(int idx, TreeMap<Integer, Boolean> marks) {
        marks.put(idx, true);
    }

    private static boolean hasVertexesToFind(LinkedList<Integer> vertexesToFind) {
        return vertexesToFind.size() != 0;
    }

    private static int getFirstUnmarkedInWholeGraph(TreeMap<Integer, Boolean> marks) {
        for (Map.Entry<Integer, Boolean> entry : marks.entrySet()) {
            if (!entry.getValue()) {
                return entry.getKey();
            }
        }

        return -1;

    }
}
