package com.company;

import java.util.*;

public class SOrtAccending {

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] element = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print(i + ": ");
            element[i] = sc.nextInt();
        }

        return element;
    }

    public static void printArray(int[] arr) {
        System.out.print("Array are : ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void sortAccending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        System.out.println("Sorted Array in Accending order  is: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void sortDescending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        System.out.println("Sorted Array in Descending order  is: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = takeInput();
        printArray(arr);
        System.out.println("1.Accending \n 2.Descending ");
        int scan = sc.nextInt();
        switch (scan) {
            case 1 -> sortAccending(arr);
            case 2 -> sortDescending(arr);
            default -> System.out.println("Invalid Option");
        }
    }

}
