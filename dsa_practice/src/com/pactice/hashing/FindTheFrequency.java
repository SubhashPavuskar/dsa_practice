package com.pactice.hashing;

import java.util.HashMap;
import java.util.Map;

public class FindTheFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 1, 5, 4, 3, 7, 8, 7, 7, 8, 8,};
        evaluateTheFrequency(arr);
    }

    private static void evaluateTheFrequency(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.merge(arr[i], 1, Integer::sum);
        }

        map.forEach((k,v)-> System.out.println("Key : " + k + " Value : " + v ));

    }


//    private static void evaluateTheFrequency(int[] arr) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if(map.containsKey(arr[i])){
//                map.put(arr[i],map.get(arr[i])+1);
//            } else {
//                map.put(arr[i],1);
//            }
//        }
//        printTheFrequency(map);
//    }
//
//    private static void printTheFrequency(Map<Integer, Integer> map) {
//        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
//    }
}
