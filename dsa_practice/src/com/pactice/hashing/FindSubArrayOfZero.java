package com.pactice.hashing;

import java.util.HashSet;
import java.util.Set;

public class FindSubArrayOfZero {
    public static void main(String[] args) {
       // int[] arr = { -1, 2, 23, 4, -5, 6, -1, -17, 18, 9 };
        int[]   arr = {-3,2,1,4};
        boolean result = findSubArrayOfZeros(arr);
        System.out.println("result=" + result);
    }

    private static boolean findSubArrayOfZeros(int[] arr) {
        int preSum = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            if(set.contains(preSum)){
                return true;
            }
            if(preSum == 0){
                return true;
            }
            set.add(preSum);
        }
        return false;
    }
}
