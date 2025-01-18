package com.pactice.binarysearch;

public class FindTheIndexOfLastOccurrenceElement {
    public static void main(String[] args) {
        int[] arr = {10, 11, 11, 55, 55, 55, 67, 78, 89, 89};

        int target = 89;

        int indexIs = findIndexOfLastOccurrence(arr, target);
        if (indexIs == -1) {
            System.out.println("No element found.");
        } else {
            System.out.println("Index of the first occurrence of the element is: " + indexIs);
        }
    }

    private static int findIndexOfLastOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                result = mid;  // Store the current index
                low = mid + 1; // Continue searching in the right half
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
}
