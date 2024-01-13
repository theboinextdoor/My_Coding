package com.company;

import java.util.Scanner;

public class SpiralMatrixTraversal {

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

    public static void spiralMatrix(int[][] arr) {
        int row = arr.length;
        if (row == 0) {
            return;
        }
        int col = arr[0].length;


        int top = 0, right = col - 1, down = row - 1, left = 0;
        int dir = 0;

        while (top <= down && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    System.out.print(arr[top][i] + " ");
                }
                top++;
            } else if (dir == 1) {
                for (int i = top; i <= down; i++) {
                    System.out.print(arr[i][right] + " ");
                }
                right--;
            } else if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[down][i] + " ");
                }
                down--;
            } else if (dir == 3) {
                for (int i = down; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
            dir = (dir + 1) % 4;
        }
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the num of  column:");
        int col = sc.nextInt();
        int[][] arr = takeInput(rows, col);
        System.out.println();
        printArray(arr, rows, col);
        System.out.println();
        spiralMatrix(arr);
    }
}
