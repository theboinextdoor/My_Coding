package com.company;

import java.util.Scanner;

public class RowsWiseSum_2D {
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

    public static void rowwisesum(int[][] arr, int rows, int col) {
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                count += arr[i][j];
            }
            System.out.print(count + " ");
            count = 0;
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
        rowwisesum(arr, rows, col);

    }
}
