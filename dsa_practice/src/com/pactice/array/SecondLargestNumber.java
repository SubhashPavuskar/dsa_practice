package com.pactice.array;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr  = new int[]{10,52,73,48,15,567,1800,988,988};
        int firstLargestNum = getLargestNumber(arr);
        System.out.println("Largest number is:: "+firstLargestNum);
        int secondLargestNum = getSecondLargestNumber(arr,firstLargestNum);
        System.out.println("Largest number is:: "+secondLargestNum);

    }
    private static int getLargestNumber(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static int getSecondLargestNumber(int[] arr, int firstLargestNum) {
        int secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > secondMax && num < firstLargestNum) {
                secondMax = num;
            }
        }
        return secondMax;
    }
}
