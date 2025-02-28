package com.pactice.hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayGivenSum {
    public static void main(String[] args) {
        int[] arr = {12, -2, 16, 4, 2, 6, 1, 8, 9, 25, 10, 10};
        int sum = 20;
        int longestArr = getLongestSubArray(arr, sum);
        System.out.println(longestArr);
    }

    private static int getLongestSubArray(int[] arr, int sum) {
        int n = arr.length;
        int preSum = 0;
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
            preSum += arr[i];
            if (preSum == sum) {
                result = i + 1;
            }
            if (!map.containsKey(preSum)) {
                map.put(preSum, i);
            }
            if (map.containsKey(preSum - sum)) {
                result = Math.max(result, i - map.get(preSum - sum));
            }
        }
        return result;
    }
}
