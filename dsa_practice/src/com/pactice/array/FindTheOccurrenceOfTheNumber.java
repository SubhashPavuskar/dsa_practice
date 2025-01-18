package com.pactice.array;

public class FindTheOccurrenceOfTheNumber {
    public static void main(String[] args) {
        int[] arr = {10, 11, 11, 55, 55, 55, 67, 78, 89, 89};

        int target = 89;

        int count = countTheOccurrence(arr, target);
        if (count == 0) {
            System.out.println("No element found.");
        } else {
            System.out.println("The occurrence of the element is: " + count);
        }
    }

    private static int countTheOccurrence(int[] arr, int target) {
        int firstIndex =  coutFirstOccurrence(arr,target);
        if (firstIndex == -1) {
            return 0;
        }
        int lastIndex =  coutLastOccurrence(arr,target);
        System.out.println(Math.sqrt(12.0));
        return lastIndex - firstIndex +1;
    }

    private static int coutFirstOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                result = mid;  // Store the current index
                high = mid - 1; // Continue searching in the left half
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    private static int coutLastOccurrence(int[] arr, int target) {
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
