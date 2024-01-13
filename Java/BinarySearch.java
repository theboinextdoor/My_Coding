package com.company;

import java.util.*;

public class BinarySearch {

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] element = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print(i + ": ");
            element[i] = sc.nextInt();
        }

        return element;
    }


    public static void printArray(int[] arr) {
        System.out.print("Array is: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] sotredArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }

    public static int binarySearch(int arr[], int x) {

//        Searching
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = takeInput();
        printArray(arr);
        int[] sort = sotredArray(arr);

        System.out.println();
        System.out.println("Enter the number for Binary Search: ");
        int num = sc.nextInt();
        printArray(sort);
        int n = binarySearch(sort, num);
        System.out.println();
        if (n > 0) {
            System.out.println(num + " is present at " + n + " index.");
        } else {
            System.out.println("Number is not present in Array .");
        }

    }
}
