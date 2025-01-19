package com.pactice.binarysearch;

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 23;
        boolean flag = getSumOfElement(arr, target);
        System.out.println("Result is :: "+flag);
    }

    private static boolean getSumOfElement(int[] arr, int target) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if(arr[i]+arr[j] == target){
                return true;
            }
            if(arr[i]+arr[j] < target){
                i = i+1;
            } else {
                j = j-1;
            }
        }
        return false;
    }
}
