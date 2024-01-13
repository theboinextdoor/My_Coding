package com.company;

import java.util.Scanner;

public class FindingLargestElement {
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the size of an element: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print(i + ": ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void printOutput(int[] arr) {
        int size = arr.length;
        System.out.print("The element inside the array is : ");
        System.out.println();
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    public static int largestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        System.out.print("The Largest number inside the array element is: ");
        int size = arr.length;
        for (int k = 0; k < size; k++) {
            if (arr[k] > max) {
                max = arr[k];
            }
        }

        return max;

    }


    public static void main(String[] args) {
        int largest[] = takeInput();
        printOutput(largest);
        int maxNum = largestElement(largest);
        System.out.println(maxNum);
    }
}
