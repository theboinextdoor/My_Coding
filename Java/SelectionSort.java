package com.company;

import java.util.Scanner;

public class SelectionSort {

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] element = new int[size];

        for (int i = 0; i < element.length; i++) {
            System.out.print(i + ": ");
            element[i] = sc.nextInt();
        }

        return element;
    }

    public static void printArray(int[] element) {
        for (int i = 0; i < element.length; i++) {
            System.out.print(element[i] + " ");
        }
    }

    public static int[] selection(int[] element) {

        for (int i = 0; i < element.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < element.length; j++) {

//                if current 'i' is greater than change it to j then swap
                if (element[smallest] > element[j]) {
                    smallest = j;
                }


            }

            //swapping elements of array:
            int temp = element[smallest];
            element[smallest] = element[i];
            element[i] = temp;

        }
        return element;
    }


    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println("\nBefore Sorting: ");
        printArray(arr);
        System.out.println("\nAfter Sorting: ");
        int[] sort = selection(arr);
        printArray(sort);
    }
}
