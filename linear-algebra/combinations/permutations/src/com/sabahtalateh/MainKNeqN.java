package com.sabahtalateh;

public class MainKNeqN {

    public static void main(String[] args) {
        int k = 5;
        int edge = 5;

        int[] set = new int[k];
        for (int i = 0; i < k; i++) {
            set[i] = i;
        }

        if (set.length == 1) {
            printArr(set, edge);
            return;
        }

        printArr(set, edge);
//        System.out.println("===");

//        int fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        int ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        System.out.println("===");

        int fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
        if (fsi != edge - 1) {
            set = revertRemains(set, edge - 1);
//            printArr(set);
        }
        int ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
        set = swap(set, fsi, ssi);
//        printArr(set);
        if (fsi != edge - 1) {
            set = revertRemains(set, fsi);
//            printArr(set);
        }

        printArr(set, edge);
//        System.out.println("===");

//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            printArr(set);
//        }
//        System.out.println("===");

        while (fsi != -1) {
            fsi = firstSwapIndex(set, edge);
            if (fsi == -1) {
                break;
            }
//            System.out.println(fsi);
            if (fsi != edge - 1) {
                set = revertRemains(set, edge - 1);
//                printArr(set);
            }
            ssi = secondSwapIndex(set, edge, fsi);
//            System.out.println(ssi);
            set = swap(set, fsi, ssi);
//            printArr(set);
            if (fsi != edge - 1) {
                set = revertRemains(set, fsi);
//                printArr(set);
            }

            printArr(set, edge);
//            System.out.println("===");
        }

//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, edge - 1);
//            System.out.println("revert after " + (edge - 1));
//            printArr(set);
//        }
//        ssi = secondSwapIndex(set, edge, fsi);
//        System.out.println(ssi);
//        set = swap(set, fsi, ssi);
//        printArr(set);
//        if (fsi != edge - 1) {
//            set = revertRemains(set, fsi);
//            System.out.println("revert after " + (fsi));
//            printArr(set);
//        }
//        System.out.println("===");
//
//        fsi = firstSwapIndex(set, edge);
//        System.out.println(fsi);


    }

    public static int[] revertRemains(int[] arr, int revertFrom) {
        for (int i = 0; i < (arr.length - revertFrom - 1) / 2; i++) {
            int t = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i + revertFrom + 1];
            arr[i + revertFrom + 1] = t;
        }

        return arr;
    }

    private static int firstSwapIndex(int[] arr, int edge) {

        int idx = -1;

        boolean found = false;

        for (int i = edge - 1; i >= 0; i--) {
            if (found) break;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    idx = i;
                    found = true;
                    break;
                }
            }
        }

        return idx;
    }

    private static int secondSwapIndex(int[] arr, int edge, int fsi) {

        int idx = -1;

        boolean found = false;

        int minGreater = 0;

        for (int i = edge - 1; i < arr.length; i++) {

            if (arr[fsi] < arr[i]) {
                minGreater = arr[i];
                idx = i;
                break;
            }
        }

        if (minGreater == 0) {
            for (int i = fsi + 1; i < arr.length; i++) {

                if (arr[fsi] < arr[i]) {
                    minGreater = arr[i];
                    idx = i;
                    break;
                }
            }
        }

        for (int i = fsi + 1; i < arr.length; i++) {

            if (arr[i] < minGreater && arr[i] > arr[fsi]) {
                minGreater = arr[i];
                idx = i;
            }
        }

        return idx;
    }

    private static int[] swap(int[] arr, int firstSwapIndex, int secondSwapIndex) {
        int t = arr[firstSwapIndex];
        arr[firstSwapIndex] = arr[secondSwapIndex];
        arr[secondSwapIndex] = t;

        return arr;
    }

    private static void printArr(int[] arr, int position) {
//        for (int elem : arr) {
//            System.out.printf("%s ", elem);
//        }

        for (int i = 0; i < position; i++) {
            System.out.printf("%s ", arr[i]);
        }

        System.out.println();
    }
}
