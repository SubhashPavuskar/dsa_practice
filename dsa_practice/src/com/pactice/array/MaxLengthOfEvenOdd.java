package com.pactice.array;

import java.lang.reflect.Array;

public class MaxLengthOfEvenOdd {
    public static void main(String[] args) {
     //   int[]   arr = {2,3,1,4,2,46,22,33,56,33,88,89,86,11};
        int[] arr = { 1, 1 , 2};
        int counter =1;
        int result = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if((i+1 < n) && ((arr[i]%2==0 && arr[i+1]%2!=0)||(arr[i]%2!=0 && arr[i+1]%2==0))){
                counter = counter+1;
            } else {
                counter = 1;
            }

            result = Math.max(result,counter);
        }
        System.out.println("Max Length of even Odd = "+result);
    }
}
