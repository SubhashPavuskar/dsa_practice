package com.pactice.array;

public class SumOfSubArray {
    public static void main(String[] args) {
        int[] arr = {23, 10, 5, 45, 67, 20, 30, 3};
        int sum = 2;

        int index = 0;
        int currentSum = 0;
        boolean found = false; // To track if we found a subarray


        for(int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            while(currentSum > sum) {
                currentSum -= arr[index];
                index++;
            }

            if(currentSum == sum) {
                System.out.println("YES");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("NO");
        }
    }
}

