package com.sabahtalateh;

public class MainKeqN {

    public static void main(String[] args) {
        int k = 5;
        int n = 2;

        int[] set = new int[k];
        for (int i = 0; i < k; i++) {
            set[i] = i;
        }


//        set[0] = 0;
//        set[1] = 1;
//        set[2] = 2;
//        set[3] = 3;
//        set[4] = 4;


        if (set.length == 1) {
            printArr(set);
            return;
        }

        printArr(set);

        int fsi = firstSwapIndex(set);
        int ssi = secondSwapIndex(set, fsi);
        set = swap(set, fsi, ssi);
        set = revertRemains(set, fsi);

        printArr(set);

        while (true) {
            fsi = firstSwapIndex(set);
            if (fsi == -1) break;
            ssi = secondSwapIndex(set, fsi);
            set = swap(set, fsi, ssi);
            set = revertRemains(set, fsi);
            printArr(set);
        }

    }

    public static int[] revertRemains(int[] arr, int revertFrom) {
        for (int i = 0; i < (arr.length - revertFrom - 1) / 2; i++) {
            int t = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i + revertFrom + 1];
            arr[i + revertFrom + 1] = t;
        }

        return arr;
    }

    public static int firstSwapIndex(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                return i - 1;
            }
        }

        return -1;
    }

    public static int secondSwapIndex(int[] arr, int firsSwapIndex) {

        int firsSwapValue = arr[firsSwapIndex];

        int minGreater = 0;
        int minGreaterIndex = 0;

        for (int i = firsSwapIndex; i < arr.length; i++) {
            if (arr[i] > firsSwapValue) {
                minGreater = arr[i];
                minGreaterIndex = i;
                break;
            }
        }

        for (int i = firsSwapIndex; i < arr.length; i++) {
            if (arr[i] < minGreater && arr[i] > firsSwapValue) {
                minGreater = arr[i];
                minGreaterIndex = i;
            }
        }

        return minGreaterIndex;
    }

    public static int[] swap(int[] arr, int firstSwapIndex, int secondSwapIndex) {
        int t = arr[firstSwapIndex];
        arr[firstSwapIndex] = arr[secondSwapIndex];
        arr[secondSwapIndex] = t;

        return arr;
    }

    private static void printArr(int[] arr) {
        for (int elem : arr) {
            System.out.printf("%s ", elem);
        }
        System.out.println();
    }
}