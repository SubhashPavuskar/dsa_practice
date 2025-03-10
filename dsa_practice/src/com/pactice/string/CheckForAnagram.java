package com.pactice.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckForAnagram {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";

        boolean result = checkStringIsAnagram(str1,str2);
        if(result){
            System.out.printf("Yes");
        } else {
            System.out.printf("No");
        }
    }
    public static boolean checkStringIsAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        str1 = new String(ch1);
        str2 = new String(ch2);

        return str1.equals(str2);

    }
}
