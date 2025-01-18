package com.pactice.array;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4, 9,18,28};

        int profit = 0;
        for (int i=1; i<arr.length; i++) {
            if(arr[i]> arr[i-1]){
                profit = profit + arr[i]-arr[i-1];
            }

        }
        System.out.println(profit);
    }
}
