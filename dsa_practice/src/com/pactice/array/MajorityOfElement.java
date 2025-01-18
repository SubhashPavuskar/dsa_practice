package com.pactice.array;

public class MajorityOfElement {
    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 3, 4, 3, 3, 8, 3, 3};
        int[] arr = {1,2,3,4,5,6,7};

        int candidate = getMajorityOfElement(arr);
        int majority = validateMajorityElement(arr, candidate);

        if (majority != -1) {
            System.out.println("Majority element: " + majority);
        } else {
            System.out.println("No majority element found.");
        }
    }

    private static int validateMajorityElement(int[] arr, int candidate) {
        int count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
        // Check if candidate appears more than n/2 times
        if (count > arr.length / 2) {
            return candidate;
        } else {
            return -1; // No majority element
        }
    }

    private static int getMajorityOfElement(int[] arr) {
        // Moore's Voting Algorithm
        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }
        return candidate;
    }
}
