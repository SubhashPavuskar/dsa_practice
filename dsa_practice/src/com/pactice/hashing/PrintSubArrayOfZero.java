package com.pactice.hashing;


import java.util.*;

public class PrintSubArrayOfZero {
    public static void main(String[] args) {
        int[] arr = { -1, 2, 23, 4, -5, 6, -1, -17, 18, 9 };
        printSubArraysWithZeroSum(arr);
    }

    private static void printSubArraysWithZeroSum(int[] arr) {
        int preSum = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();

        // Insert (0, -1) to handle cases where a subarray starts from index 0
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];  // Update prefix sum

            // If preSum is already in map, it means subarrays exist
            if (map.containsKey(preSum)) {
                for (int startIdx : map.get(preSum)) {
                    System.out.println("Zero-sum subarray found: " + Arrays.toString(Arrays.copyOfRange(arr, startIdx + 1, i + 1)));
                }
            }

            // Add current index to the map
            map.putIfAbsent(preSum, new ArrayList<>());
            map.get(preSum).add(i);
        }
    }
}
