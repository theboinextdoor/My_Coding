package com.company;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of column : ");
        int col = sc.nextInt();

        int[][] arr = new int[rows][col];

//        taking Input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[ " + i + "," + j + " ]: ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }


//        printing Array

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


//        cheching for the number

        System.out.println("Enter the number you want to search: ");
        int num = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == num) {
                    System.out.println("Number is present at " + i + " rows " + j + " column.");
                }

            }
        }
    }
}
