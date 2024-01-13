package com.company;

import java.util.*;

public class LargestRoworCol {
    public static int[][] takeInput(int rows, int col) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[rows][col];

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
        int sum = 0;
        System.out.println("Array are: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }

            System.out.print(" :" + sum);
            System.out.println();
            sum = 0;
        }
    }

    public static void largestValue(int[][] arr, int rows, int col) {
//        For a given two-dimensional integer array/list of size (N x M),
//        you need to find out which row or column has the largest
//        sum(sum of all the elements in a row/column) amongst all
//        the rows and columns.
        int sum = 0;
        int flag = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                sum += arr[i][j];
            }
            if (sum > max) {
                max = sum;
                flag = i;
            }
            sum = 0;
        }
        System.out.println(flag);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns :");
        int col = sc.nextInt();

        int[][] arr = takeInput(rows, col);
        printArray(arr, rows, col);
        largestValue(arr, rows, col);
    }
}
