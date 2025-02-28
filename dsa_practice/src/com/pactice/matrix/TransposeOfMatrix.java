package com.pactice.matrix;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = {  {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};

        System.out.println("Given Matrix is :: ");
        printMatrix(matrix);
        System.out.println("Transposed Matrix is :: ");
        trasposedMatrix(matrix);

    }

    private static void trasposedMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
