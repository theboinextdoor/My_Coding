package com.company;

import java.util.Scanner;

public class WaveSortedArray {

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

    public static int[] sorting(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        return arr;

    }


    public static int[] waveArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println("\nBefore Sorted Array: ");
        printArray(arr);
        int[] sort = sorting(arr);
        System.out.println("\nAfter Sorted Array: ");
        printArray(sort);
        int[] wavy = waveArray(sort);
        System.out.println("\nWavy array are: ");
        printArray(wavy);


    }
}
