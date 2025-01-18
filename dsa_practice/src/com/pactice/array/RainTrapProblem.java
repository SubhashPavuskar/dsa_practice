package com.pactice.array;

public class RainTrapProblem {
    public static void main(String[] args) {
        int[] arr = {6,4,5,2,3,5,7};

        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        left[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
             left[i] = Math.max(left[i-1], arr[i]);
        }

        right[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            right[i] = Math.max(right[i+1], arr[i]);
        }

        int res = 0;
        for(int i=1; i<arr.length-1; i++) {
            res += Math.min(left[i] , right[i]) - arr[i];
        }

        System.out.println("Rain trapped :"+res);
    }
}
