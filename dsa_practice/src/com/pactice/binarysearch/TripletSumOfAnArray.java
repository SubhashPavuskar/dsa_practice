package com.pactice.binarysearch;

public class TripletSumOfAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 241;
        boolean result = getSumOfTriplet(arr, target);
        if (result) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    private static boolean getSumOfTriplet(int[] arr, int target) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (isPair(arr, target - arr[i], i + 1)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPair(int[] arr, int x, int si) {
        int i = si;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == x) {
                return true;
            }
            if (arr[i] + arr[j] < x) {
                i = i + 1;
            }
            if (arr[i] + arr[j] > x) {
                j = j - 1;
            }
        }
        return false;
    }
}
