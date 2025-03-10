package com.pactice.string;

public class CheckForAnagramASCII {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listeny";
        boolean result = checkForAnagramASCIIChar(str1,str2);

        if(result){
            System.out.println("It is anagram");
        } else {
            System.out.println("It is not anagram");
        }
    }

    private static boolean checkForAnagramASCIIChar(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }
        int charCount[] = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }

        for(int count:charCount){
            if(count != 0){
                return false;
            }
        }
        return true;
    }

}
