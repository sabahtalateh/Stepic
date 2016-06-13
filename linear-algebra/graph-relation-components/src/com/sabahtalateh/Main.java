package com.sabahtalateh;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap<Integer, ArrayList<Integer>> adjList = new TreeMap<Integer, ArrayList<Integer>>() {{
            put(1, new ArrayList<Integer>() {{
                add(1);
                add(5);
            }});
            put(2, new ArrayList<Integer>() {{
                add(1);
                add(5);
            }});
            put(3, new ArrayList<Integer>() {{
                add(4);
            }});
            put(4, new ArrayList<Integer>() {{
                add(3);
            }});
            put(5, new ArrayList<Integer>() {{
                add(1);
                add(2);
            }});

//            put(6, new ArrayList<Integer>() {{
//                add(6);
//            }});
        }};

        TreeMap<Integer, Boolean> marks = new TreeMap<Integer, Boolean>() {{
            put(1, false);
            put(2, false);
            put(3, false);
            put(4, false);
            put(5, false);
//            put(6, false);
        }};

        LinkedList<Integer> vertexesToFind = new LinkedList<>();
//        vertexesToFind.add(1);

        int components = 0;
        while (hasUnmarkedInWholeGraph(marks)) {
            components++;

            vertexesToFind.add(getFirstUnmarkedInWholeGraph(marks));

            while (true) {

                markVertexAsVisited(vertexesToFind.getFirst(), marks);
                fillVertexToFind(adjList, vertexesToFind.getFirst(), vertexesToFind, marks);
                vertexesToFind.remove(0);

                if (hasVertexesToFind(vertexesToFind)){
                    continue;
                } else {
                    break;
                }
//                if (!hasUnmarkedAdjacent(adjList, marks, vertexesToFind.getFirst())) break;

//                getIndexOfFirstUnmarkedNotInVertexListAndFillVertexToFind();
            }
        }

        System.out.println(components);

//        for (Map.Entry<Integer, ArrayList<Integer>> entry : adjList.entrySet()) {
//            System.out.println(entry.getValue());
//        }
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
