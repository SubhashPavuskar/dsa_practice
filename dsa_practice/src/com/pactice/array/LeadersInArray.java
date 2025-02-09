package com.pactice.array;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {99, 48, 23, 13, 44, 51, 16, 72, 48, 29};

        int curr_led = arr[arr.length - 1];
        System.out.print(curr_led);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (curr_led < arr[i]) {
                curr_led = arr[i];
                System.out.print(" " + curr_led);
            }
        }
    }
}