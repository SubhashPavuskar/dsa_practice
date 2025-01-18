package com.pactice.array;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {99, 48, 23, 13, 44, 51, 16, 72, 48, 29};

        int curr_led = arr[arr.length - 1];
        System.out.print(curr_led);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (curr_led < arr[i]) {
                curr_led = arr[i];
                System.out.print(" " + curr_led);
            }
        }
    }

//    public static void findLeaders(int[] arr) {
//        // List to store the leaders
//        List<Integer> leaders = new ArrayList<>();
//
//        int n = arr.length;
//        // Initialize the maximum from the right
//        int maxFromRight = arr[n - 1];
//        // Add the last element as it is always a leader
//        leaders.add(maxFromRight);
//
//        // Traverse the array from right to left
//        for (int i = n - 2; i >= 0; i--) {
//            if (arr[i] > maxFromRight) {
//                maxFromRight = arr[i];
//                leaders.add(maxFromRight);
//            }
//        }
//
//        // Print leaders in reverse order as we collected them from the right
//        for (int i = leaders.size() - 1; i >= 0; i--) {
//            System.out.print(leaders.get(i) + " ");
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {99, 48, 23, 13, 44, 51, 16, 72, 48, 29};
//        System.out.println("Leaders in the array:");
//        findLeaders(arr);
//    }
}