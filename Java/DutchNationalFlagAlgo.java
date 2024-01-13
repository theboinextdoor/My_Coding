package com.company;

import java.util.Scanner;

public class DutchNationalFlagAlgo {

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

    public static void swap(int[] arr, int low, int mid) {
        int temp = arr[low];
        arr[low] = arr[mid];
        arr[mid] = temp;

    }


    public static int[] sorting(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println("\nBefore Sorting Array: ");
        printArray(arr);
        int[] sort = sorting(arr);
        System.out.println("\nAfter Sorting Array: ");
        printArray(sort);


    }
}
