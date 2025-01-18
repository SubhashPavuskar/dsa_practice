package com.pactice.array;

public class ArrayNumberFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 5};

        int i = 0; // Start of the array
        System.out.println("Number Frequencies:");

        while (i < arr.length) {
            int count = 1; // Initialize count for current number
            int current = arr[i];

            // Count occurrences of the current number
            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }

            // Print the frequency
            System.out.println(current + ": " + count);

            // Move to the next unique number
            i++;
        }
    }
}
