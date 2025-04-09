package com.pactice.string;

import java.util.HashMap;
import java.util.Map;

public class LeftMostRepeatingChar {

    public static void main(String[] args) {
        String str = "abcbcbb";
        int result = getLeftMostRepeatingChar(str);
        System.out.printf("Index is ::"+result);

    }

    private static int getLeftMostRepeatingChar(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                map.put(chars[i], map.get(chars[i]) + 1);
            } else {
                map.put(chars[i], 1);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) > 1) {
                return i;
            }
        }
        return -1;
    }
}
