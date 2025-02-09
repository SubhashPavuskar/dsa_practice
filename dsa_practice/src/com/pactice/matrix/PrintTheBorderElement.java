package com.pactice.matrix;

public class PrintTheBorderElement {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println("The Matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        printBorder(matrix);
    }

    private static void printBorder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        //Edge case for 1 Row
        if (rows == 1) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[0][j] + "\t");
            }
            return;
        }
        //Edge case for 1 Column
        if (cols == 1) {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrix[i][0] + "\t");
            }
            return;
        }

        //print First row
        for (int j = 0; j < cols; j++) {
            System.out.print(matrix[0][j] + "\t");
        }

        //Print right side of the column
        for (int i = 1; i < rows - 1; i++) {
            System.out.print(matrix[i][cols - 1] + "\t");
        }

        //Print Bottom row
        for (int j = cols - 1; j >= 0; j--) {
            System.out.print(matrix[rows - 1][j] + "\t");
        }

        //Print left side os the column
        for (int i = rows - 2; i > 0; i--) {
            System.out.print(matrix[i][0] + "\t");
        }
    }
}
