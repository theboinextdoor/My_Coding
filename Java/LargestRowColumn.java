package com.company;

import java.util.*;

public class LargestRowColumn {
    public static int[][] takeInput(int rows, int col) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows:");
//        int rows = sc.nextInt();
//        System.out.println("Enter the number of columns:");
//        int col = sc.nextInt();

        int arr[][] = new int[rows][col];

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + i + "," + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        return arr;

    }

    public static void printArray(int[][] arr, int rows, int col) {
        System.out.println("Array are: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void LargestSum(int[][] mat) {
        int largestRow = Integer.MIN_VALUE;
        int largestCol = Integer.MIN_VALUE;


        int indexrow = 0;
        int indexcol = 0;

        int sumcol = 0, sumrow = 0;

        // for sum of rows
        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {
                sumrow += mat[i][j];
            }
            if (sumrow > 0 && sumrow > largestRow) {
                largestRow = sumrow;
                indexrow = i;
            }
        }

        // for sum of col
        for (int j = 0; j < mat[j].length; j++) {

            for (int i = 0; i < mat.length; i++) {
                sumcol += mat[i][j];
            }
            if (sumcol > 0 && sumcol > largestCol) {
                largestCol = sumcol;
                indexcol = j;
            }
        }

        if (largestRow > largestCol) {
            System.out.println(indexrow + " " + sumrow);
        } else {
            System.out.println(indexcol + " " + sumcol);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns :");
        int col = sc.nextInt();

        int[][] arr = takeInput(rows, col);
        printArray(arr, rows, col);
        LargestSum(arr);


    }
}
