package com.sabahtalateh;

public class Main {

    public static void main(String[] args) {
        int k = 5;
        int n = 5;

        int[] set = new int[k];
        for (int i = 0; i < k; i++) {
            set[i] = i;
        }

        set[0] = 0;
        set[1] = 1;
        set[2] = 2;
        set[3] = 4;
        set[4] = 3;

        System.out.println(indexToSwap(set));
        printArr(swap(set, indexToSwap(set)));
    }

    public static int indexToSwap(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                return i - 1;
            }
        }

        return -1;
    }

    public static int[] swap(int[] arr, int swapIndex) {
        int t = arr[swapIndex];
        arr[swapIndex] = arr[swapIndex + 1];
        arr[swapIndex + 1] = t;

        return arr;
    }

    private static void printArr(int[] arr) {
        for (int elem : arr) {
            System.out.printf("%s ", elem);

        }
        System.out.println();
    }
}