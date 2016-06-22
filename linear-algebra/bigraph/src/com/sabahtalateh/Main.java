package com.sabahtalateh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String s = reader.readLine();
//
//        int v = Integer.parseInt(s.split(" ")[0]);
//        int e = Integer.parseInt(s.split(" ")[1]);
//
//        TreeMap<Integer, ArrayList<Integer>> adjList = new TreeMap<>();
//        TreeMap<Integer, Boolean> marks = new TreeMap<>();
//
//        for (int i = 0; i < v; i++) {
//            ArrayList<Integer> linkToSelf = new ArrayList<>();
//            linkToSelf.add(i + 1);
//            adjList.put(i + 1, linkToSelf);
//            marks.put(i + 1, false);
//        }
//
//        for (int i = 0; i < e; i++) {
//            s = reader.readLine();
//
//            int from = Integer.parseInt(s.split(" ")[0]);
//            int to = Integer.parseInt(s.split(" ")[1]);
//
//            ArrayList<Integer> vertsToAddTo = adjList.get(from);
//            if (!vertsToAddTo.contains(to)) {
//                vertsToAddTo.add(to);
//            }
//
//            ArrayList<Integer> vertsToAddFrom = adjList.get(to);
//            if (!vertsToAddFrom.contains(from)) {
//                vertsToAddFrom.add(from);
//            }
//        }


//        System.out.println(adjList);


        TreeMap<Integer, ArrayList<Integer>> adjList = new TreeMap<Integer, ArrayList<Integer>>() {{
//            put(1, new ArrayList<Integer>() {{
//                add(1);
//                add(2);
//                add(3);
//            }});
//            put(2, new ArrayList<Integer>() {{
//                add(2);
//                add(1);
//                add(4);
//                add(3);
//            }});
//            put(3, new ArrayList<Integer>() {{
//                add(3);
//                add(1);
//                add(4);
//                add(2);
//            }});
//            put(4, new ArrayList<Integer>() {{
//                add(4);
//                add(2);
//                add(3);
//            }});
//            put(5, new ArrayList<Integer>() {{
//                add(5);
//                add(6);
//            }});
//            put(6, new ArrayList<Integer>() {{
//                add(6);
//                add(5);
//            }});
            put(1, new ArrayList<Integer>() {{
                add(1);
                add(2);
                add(3);
            }});
            put(2, new ArrayList<Integer>() {{
                add(2);
                add(1);
                add(4);
            }});
            put(3, new ArrayList<Integer>() {{
                add(3);
                add(1);
                add(4);
            }});
            put(4, new ArrayList<Integer>() {{
                add(4);
                add(2);
                add(3);
                add(5);
                add(6);
            }});
            put(5, new ArrayList<Integer>() {{
                add(5);
                add(4);
                add(6);
            }});
            put(6, new ArrayList<Integer>() {{
                add(6);
                add(4);
                add(5);
            }});
//            put(7, new ArrayList<Integer>() {{
//                add(7);
//                add(3);
//                add(8);
//            }});
//            put(8, new ArrayList<Integer>() {{
//                add(8);
//                add(7);
//                add(9);
//            }});
//            put(9, new ArrayList<Integer>() {{
//                add(9);
//                add(8);
//            }});
//
//            put(10, new ArrayList<Integer>() {{
//                add(10);
//            }});
        }};

        TreeMap<Integer, String> marks = new TreeMap<>();

        for (int i = 0; i < adjList.size(); i++) {
            marks.put(i + 1, "");
        }

        LinkedList<TreeMap<Integer, Integer>> edgesLeft = new LinkedList<>();
        for (Map.Entry<Integer, ArrayList<Integer>> entry : adjList.entrySet()) {
            for (Integer vertex : entry.getValue()) {
                if (!Objects.equals(entry.getKey(), vertex)) {
                    TreeMap<Integer, Integer> edge = new TreeMap<>();
                    edge.put(entry.getKey(), vertex);
                    edgesLeft.add(edge);
                }
            }
        }

        TreeMap<Integer, Integer> passed = new TreeMap<>();


        TreeMap<Integer, Integer> vertexesToFind = new TreeMap<>();
//        int[] prevAndCurr = new int[2];

        int components = 0;
        while (hasUnmarkedInWholeGraph(marks)) {

            Integer distance = 0;

//            prevAndCurr[0] = -1;
//            prevAndCurr[1] = -1;

            components++;
            int firstUnmarked = getFirstUnmarkedInWholeGraph(marks);
            vertexesToFind.put(firstUnmarked, distance);

            while (true) {

                Map.Entry<Integer, Integer> firstVertex = vertexesToFind.firstEntry();
                vertexesToFind.remove(vertexesToFind.firstEntry().getKey());
                markVertexAsVisited(firstVertex.getKey(), marks, firstVertex.getValue());

                distance = fillVertexToFind(adjList, firstVertex.getKey(), vertexesToFind, marks, firstVertex.getValue(), passed);

//                prevAndCurr[0] = prevAndCurr[1];
//                prevAndCurr[1] = lastVertex.getKey();
//
//                if ((prevAndCurr[0] != prevAndCurr[1]) && (prevAndCurr[0] != -1 && prevAndCurr[1] != -1)) {
//                    removeFromEdgesLeft(edgesLeft, prevAndCurr[0], prevAndCurr[1]);
//                }

                if (hasVertexesToFind(vertexesToFind)) {
                    continue;
                } else {
                    break;
                }
            }
        }

        if (edgesLeft.size() != 0) {
            for (TreeMap<Integer, Integer> el : edgesLeft) {
                if (marks.get(el.firstEntry().getKey()).equals(marks.get(el.firstEntry().getValue()))) {
                    System.out.println("NO");
                    return;
                }

                if (marks.get(el.firstEntry().getValue()).equals(marks.get(el.firstEntry().getKey()))) {
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
            return;
        } else {
            System.out.println("YES");
            return;
        }

//        System.out.println(components);
//        System.out.println(edgesLeft);
    }

    private static LinkedList<TreeMap<Integer, Integer>> removeFromEdgesLeft(LinkedList<TreeMap<Integer, Integer>> edgesLeft, int v1, int v2) {

        Iterator<TreeMap<Integer, Integer>> i = edgesLeft.iterator();

        while (i.hasNext()) {
            TreeMap<Integer, Integer> el = i.next();

            if (el.firstEntry().getKey() == v1 && el.firstEntry().getValue() == v2) {
                i.remove();
            }

            if (el.firstEntry().getKey() == v2 && el.firstEntry().getValue() == v1) {
                i.remove();
            }
        }

        return edgesLeft;
    }

    private static boolean hasUnmarkedAdjacent(TreeMap<Integer, ArrayList<Integer>> adjList, TreeMap<Integer, Boolean> marks, Integer vertexToCheck) {
        for (Integer vertex : adjList.get(vertexToCheck)) {
            if (!marks.get(vertex)) {
                return true;
            }
        }

        return false;
    }

    private static boolean hasUnmarkedInWholeGraph(TreeMap<Integer, String> list) {
        for (Map.Entry<Integer, String> entry : list.entrySet()) {
            if (entry.getValue().equals("")) return true;
        }

        return false;
    }

    private static int fillVertexToFind(
            TreeMap<Integer, ArrayList<Integer>> adjList,
            int vertexIndex,
            TreeMap<Integer, Integer> vertexesToFind,
            TreeMap<Integer, String> marks,
            int distance,
            TreeMap<Integer, Integer> passed
    ) {
        for (Integer vertex : adjList.get(vertexIndex)) {
            if (marks.get(vertex).equals("") && !vertexesToFind.containsKey(vertex)) {
                distance = distance + 1;
                break;
            }
        }

        for (Integer vertex : adjList.get(vertexIndex)) {
            if (marks.get(vertex).equals("") && !vertexesToFind.containsKey(vertex)) {
                vertexesToFind.put(vertex, distance);
                passed.put(vertexIndex, vertex);
            }
        }

        return distance;
    }

    private static void markVertexAsVisited(int idx, TreeMap<Integer, String> marks, int distance) {
        String color;
        if (distance % 2 == 0) {
            color = "black";
        } else {
            color = "white";
        }
        marks.put(idx, String.valueOf(color));
    }

    private static boolean hasVertexesToFind(TreeMap<Integer, Integer> vertexesToFind) {
        return vertexesToFind.size() != 0;
    }

    private static int getFirstUnmarkedInWholeGraph(TreeMap<Integer, String> marks) {
        for (Map.Entry<Integer, String> entry : marks.entrySet()) {
            if (entry.getValue().equals("")) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
