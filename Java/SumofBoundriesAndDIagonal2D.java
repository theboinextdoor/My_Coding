package com.company;

import java.util.*;

public class SumofBoundriesAndDIagonal2D {


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
        System.out.println("Array are: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void boundrySum(int[][] arr, int rows, int col) {

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            int digR = rows - i;
            for (int j = 0; j < col; j++) {
                if (i == 0 || j == 0 || j == col - 1 || i == rows - 1 || j == digR - 1 || j == i) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Sum of Boundries and Diagonal: " + sum);


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of column:");
        int col = sc.nextInt();

        int[][] arr = takeInput(rows, col);
        printArray(arr, rows, col);
        boundrySum(arr, rows, col);

    }
}
