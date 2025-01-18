package com.pactice.array;

public class FindLargestNumber {
    public static void main(String[] args) {
        int[] arr  = new int[]{-10,-52,-73,-48,-15,-567,-100,-88,-90};
        int k=0;

        for(int i =0; i < arr.length; i++){
            if(k < arr[i]){
                k=arr[i];
            }
            else {
                k = k;
            }
        }
        System.out.println("Largest number is:: "+k);
    }
}
