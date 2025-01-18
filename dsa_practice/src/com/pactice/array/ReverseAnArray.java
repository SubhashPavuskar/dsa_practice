package com.pactice.array;

public class ReverseAnArray
{
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.print("Original Array : " );
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("Reversed Array : " );
        for (int i=0; i<arr.length; i++){
            System.out.print(arr.length-i + " ");
        }
    }
}
