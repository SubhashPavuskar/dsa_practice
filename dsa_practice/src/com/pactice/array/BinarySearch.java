package com.pactice.array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 , 90, 98,100, 400};

        int search = 400;

        boolean found = searchResult(arr,search);

        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }

    }

    private static boolean searchResult(int[] arr, int search) {
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == search){
                return true;
            } else if( arr[mid] > search){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
