package com.company;

import java.util.Scanner;

public class InsertionSort {

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] insertionsort(int[] arr) {


//      sorting in ascending order
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

//          swapping
            arr[j + 1] = current;
        }
        return arr;
    }


    public static void main(String[] args) {

        int input[] = takeInput();
        System.out.println("\nBefore Sorting: ");
        printArray(input);
        int sort[] = insertionsort(input);
        System.out.println("\nAfter sorting ");
        printArray(sort);

    }
}
