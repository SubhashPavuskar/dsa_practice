package com.pactice.array;

public class MaximumSumOfSubArray {
    public static void main(String[] args) {
        int[] arr = {-18,-8,7,-1,4};
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int curr = 0;
           for (int j = i; j < arr.length; j++) {
            curr = curr +arr[j];
            res = Math.max(res,curr);
           }
        }
        System.out.println("Max Sum Is :: " +res);

/*
        int[] arr = {2,3,-8,7,-1,2,3};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if( i != j){
                    sum = Math.max(sum, arr[i] + arr[j]);
                }
            }
        }
        System.out.println("Maximum Sum = " + sum);*/
    }

}
