package com.pactice.array;

public class MaxConsecutiveOne {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,0};
        //int[] arr = { 0, 0, 0,0};
        int count = 0;
        int current = 0 ;
        int res = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                current =  count ++;
                res =  Math.max(current,res);
            } if (arr[i] == 0) {
                count = 0;
            }
        }
        System.out.println("Maximum consecutive number is: "+res);


        /*int current = 0;
        int previous = 0;
        while (i < arr.length) {
            int count = 1;
            while (i + 1 < arr.length && arr[i] == arr[i + 1] && arr[i] == 1) {
                count = count + 1;
                i++;
            }
            i++;
            current = count;
            previous = Math.max(current, previous);

        }
        System.out.println("Maximum consecutive number is: " + previous);*/
    }
}
