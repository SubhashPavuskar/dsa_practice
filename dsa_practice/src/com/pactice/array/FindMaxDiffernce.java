package com.pactice.array;

public class FindMaxDiffernce
{
    public static void main(String[] args) {
        int[] arr = { 11, 29, 3, 45, 53, 36, 75, 88, 90 };
        int res= arr[1] - arr[0];
        int min_val = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = Math.max(res, arr[i]-min_val);
            min_val = Math.min(min_val,arr[i]);
        }
        System.out.println(res);
    }
}
