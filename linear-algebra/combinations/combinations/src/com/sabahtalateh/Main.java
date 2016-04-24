package com.sabahtalateh;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 8};
        comb(arr, 3);
    }

    public static void comb(int[] arr, int k) {
        int n = arr.length;
        int[] A = new int[k];
        // initialize
        for (int i = 0; i <= k - 1; i++) {
            A[i] = i;
        }
        int i, p;
        while (true) {
            for (i = 0; i < k; i++) System.out.printf("%s ", A[i]);
            System.out.println();
            if (A[k - 1] < n - 1)
                A[k - 1]++;
            else {
                for (p = k - 1; p > 0; p--) {
                    if (A[p] - A[p - 1] > 1)
                        break;
                }
                if (p == 0)
                    break;
                A[p - 1]++;
                for (i = p; i < k; i++)
                    A[i] = A[i - 1] + 1;
            }
        }
    }

    public static void output(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
