package com.sabahtalateh;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int vertexNumber = 6;
        int edgesNumber = 10;

        TreeMap<Integer, ArrayList<Integer>> adjList = new TreeMap<Integer, ArrayList<Integer>>() {{
            put(1, new ArrayList<Integer>() {{
                add(1);
                add(2);
                add(4);
            }});

            put(2, new ArrayList<Integer>() {{
                add(2);
                add(1);
                add(4);
                add(6);
                add(3);
            }});

            put(3, new ArrayList<Integer>() {{
                add(3);
                add(2);
                add(5);
            }});

            put(4, new ArrayList<Integer>() {{
                add(4);
                add(1);
                add(2);
                add(6);
                add(5);
            }});

            put(5, new ArrayList<Integer>() {{
                add(5);
                add(4);
                add(3);
            }});

            put(6, new ArrayList<Integer>() {{
                add(6);
                add(2);
                add(4);
            }});

        }};

        if (getRelationComponents(adjList) != 1) {
            System.out.println("NONE");
            return;
        }

        int[][] edges = new int[edgesNumber][2];

        edges[0][0] = 1; edges[0][1] = 2;
        edges[1][0] = 1; edges[1][1] = 4;
        edges[2][0] = 2; edges[2][1] = 4;
        edges[3][0] = 2; edges[3][1] = 6;
        edges[4][0] = 4; edges[4][1] = 6;
        edges[5][0] = 4; edges[5][1] = 5;
        edges[6][0] = 5; edges[6][1] = 3;
        edges[7][0] = 2; edges[7][1] = 3;
        edges[7][0] = 2; edges[7][1] = 3;
        edges[8][0] = 1; edges[8][1] = 2;
        edges[9][0] = 1; edges[9][1] = 2;

        int[] vertexEdgesCount = new int[vertexNumber];

        for (int[] edge : edges) {
            for (int vertex : edge) {
                vertexEdgesCount[vertex - 1]++;
                System.out.print(vertex + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(vertexEdgesCount));

        for (int edgeCount : vertexEdgesCount) {
            if (edgeCount % 2 != 0) {
                System.out.printf("NONE");
                return;
            }
        }
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
