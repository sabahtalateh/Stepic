package com.sabahtalateh;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int k = 5;
        int n = 4;

        int[] set = new int[k];
        for (int i = 0; i < k; i++) {
            set[i] = i;
        }

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
//        a[0] = 4;
//        a[1] = 3;
//        a[2] = 0;
//        a[3] = 1;
        int bound = bound(set, a);

        int[] maxValues = new int[n];
        for (int i = 0; i < maxValues.length; i++) {
            maxValues[i] = set[set.length - i - 1];
        }


//        set = new int[5];
//        set[0] = 0;
//        set[1] = 1;
//        set[2] = 2;
//        set[3] = 3;
//        set[4] = 4;
//
//        a = new int[4];
//        a[0] = 4;
//        a[1] = 0;
//        a[2] = 2;
//        a[3] = 3;
//
//        bound = 2;
//        int ind = boundReachedIndex(a, bound);
//
//        a = reformArray(set, a, ind);
//
//        int u = 1 + 2;

        int[] leftInSet = new int[set.length];
        for (int i = 0; i < leftInSet.length; i++) {
            leftInSet[i] = set[i];
        }

        while (true) {
            if (done(set, a)) {
                printArray(a);
                break;
            }
            printArray(a);
            if (boundReached(a, bound)) {
                int boundReachedIndex = boundReachedIndex(maxValues, a, bound);
                a = reformArray(set, a, boundReachedIndex);
                bound = bound(set, a);
                for (int i = 0; i < leftInSet.length; i++) {
                    leftInSet[i] = set[i];
                }

            } else {
//                if ((a[a.length - 1] + 1) == (a[a.length - 2])) {
//                    a[a.length - 1] += 2;
//                } else {
//                    a[a.length - 1] += 1;
//                }

                for (int i = 0; i < set.length; i++) {
                    for (int j = 0; j < a.length; j++) {
                        if (set[i] == a[j]) {
                            leftInSet[i] = -1;
                        }
                    }
                }


                int increased = -1;
                for (int i = 0; i < leftInSet.length; i++) {
                    if (leftInSet[i] != -1) {
                        increased = leftInSet[i];
                        break;
                    }
                }
                a[a.length - 1] = increased;

//                if (!arrayContains(a, increased)) {
//                    a[a.length - 1] = increased;
//                } else {
//                    a[a.length - 1] = increasedValue(set, a);
//                }
//                a[a.length - 1]++;
            }
        }
    }

    public static int increasedValue(int[] set, int[] arr) {
        int[] leftInSet = new int[set.length - arr.length];
        for (int i = 0; i < leftInSet.length; i++) {
            leftInSet[i] = -1;
        }
        int leftInSetCount = 0;
        for (int i = 0; i < set.length; i++) {
            boolean contains = false;
            for (int j = 0; j < arr.length; j++) {
                if (set[i] == arr[j]) {
                    contains = true;
                }
            }
            if (!contains) {
                leftInSet[leftInSetCount] = set[i];
                leftInSetCount++;
            }
        }

        return leftInSet[0];
    }

    public static int increaseForPosition(int[] set, int[] previousArr, int[] arr, int position) {
//        int leftInSetLength = set.length;
//        for (int i = 0; i < set.length; i++) {
//            for (int j = 0; j < previousArr.length; j++) {
//                if (set[i] == previousArr[j] || set[i] == arr[j]) {
//                    leftInSetLength -= 1;
//                }
//            }
//        }
//
//        int[] leftInSet = new int[leftInSetLength];
//        int leftInSetCount = 0;
//        for (int i = 0; i < set.length; i++) {
//            boolean contains = false;
//            for (int j = 0; j < previousArr.length; j++) {
//                if (set[i] == previousArr[j] || set[i] == arr[j]) {
//                    contains = true;
//                }
//            }
//            if (!contains) {
//                leftInSet[leftInSetCount] = set[i];
//                leftInSetCount++;
//            }
//        }


        int maxInSet = set[set.length - 1];
        int max = arr[0];
        if (max == maxInSet) {
            max = arr[1];
        }
        for (int i = 0; i < position + 1; i++) {
            if (arr[i] == maxInSet) continue;
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max + 1;
    }

    public static int[] reformArray(int[] set, int arr[], int boundReachedIndex) {
        int indexToIncrease = boundReachedIndex - 1;
        int[] result = new int[arr.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }

        for (int i = 0; i <= indexToIncrease; i++) {
            if (indexToIncrease == i) {
                int increased = arr[i] + 1;
                if (arrayContains(result, increased)) {
                    result[i] = increaseForPosition(set, arr, result, indexToIncrease);
                } else {
                    result[i] = increased;
                }

            } else {
                result[i] = arr[i];
            }

        }

        int leftInSetLength = set.length;
        for (int i = 0; i < set.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (set[i] == result[j]) {
                    leftInSetLength -= 1;
                }
            }
        }
        int[] leftInSet = new int[leftInSetLength];
        for (int i = 0; i < leftInSet.length; i++) {
            leftInSet[i] = -1;
        }
        int leftInSetCount = 0;
        for (int i = 0; i < set.length; i++) {
            boolean contains = false;
            for (int j = 0; j < result.length; j++) {
                if (set[i] == result[j]) {
                    contains = true;
                }
            }
            if (!contains) {
                leftInSet[leftInSetCount] = set[i];
                leftInSetCount++;
            }
        }

        int leftInSetIndex = 0;
        for (int i = boundReachedIndex; i < result.length; i++) {
            result[i] = leftInSet[leftInSetIndex];
            leftInSetIndex++;
        }

        return result;
    }

    public static boolean arrayContains(int[] arr, int value) {
        boolean contains = false;
        for (int anArr : arr) {
            if (anArr == value) {
                contains = true;
            }
        }
        return contains;
    }

    public static int maxInArray(int[] arr) {
        int max = arr[0];
        for (int anArr : arr) {
            if (anArr > max) {
                max = anArr;
            }
        }

        return max;
    }

    public static int boundReachedIndex(int[] maxValues, int arr[], int bound) {
        int[] arrCp = Arrays.copyOfRange(arr, 0, arr.length);

        for (int i = 0; i < arrCp.length; i++) {
            if (arrCp[i] == maxValues[i]) {
                arrCp[i] = -1;
            }
        }
        int min = arrCp[0];
        int minIndex = 0;
        for (int i = 1; i < arrCp.length; i++) {
            if (arrCp[i] < min) {
                min = arrCp[i];
                minIndex = i;
            }
        }

        int max = arrCp[minIndex];
        int maxIndex = minIndex;
        for (int i = 1; i < arrCp.length; i++) {
            if (arrCp[i] > max) {
                max = arrCp[i];
                maxIndex = i;
            }
        }

        return maxIndex;
//
//        return maxIndex;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == bound) {
//                return i;
//            }
//        }
//        return -1;
    }

    public static boolean boundReached(int[] arr, int bound) {
        return arr[arr.length - 1] == bound;
    }

    public static boolean done(int[] set, int[] arr) {
        boolean done = true;
        for (int i = 0; i < arr.length; i++) {
            if (set[set.length - i - 1] != arr[i]) {
                done = false;
            }
        }

        return done;
    }

    public static int bound(int[] set, int[] arr) {
        int[] boundsSet = new int[set.length - arr.length];

        int boundCount = 0;
        for (int i : set) {
            boolean contains = false;
            for (int j : arr) {
                if (i == j) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                boundsSet[boundCount] = i;
                boundCount++;
            }
        }

        return boundsSet[boundCount - 1];
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.printf("%s ", i);
        }
        System.out.println();
    }
}
