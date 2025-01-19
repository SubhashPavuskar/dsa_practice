package com.pactice.binarysearch;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 5, 6, 7, 8, 9, 2};
        int peakIndex = getPeakElement(arr);

        // Check if the peak element index is valid and print the value
        if (peakIndex != -1) {
            System.out.println("Peak element: " + arr[peakIndex]);
        } else {
            System.out.println("No peak element found.");
        }
    }

    private static int getPeakElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1; // No peak element in an empty array
        }

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // Check if mid is a peak element
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arr.length - 1 || arr[mid + 1] <= arr[mid])) {
                return mid;
            }

            // If the left neighbor is greater, search the left half
            if (mid > 0 && arr[mid - 1] >= arr[mid]) {
                high = mid - 1;
            }
            // Otherwise, search the right half
            else {
                low = mid + 1;
            }
        }

        return -1; // No peak element found
    }
}
