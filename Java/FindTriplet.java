package com.company;

import java.util.*;

public class FindTriplet {

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

    public static void printlArray(int[] element) {
        System.out.print("Array are: ");
        for (int j : element) {
            System.out.print(j + " ");
        }
    }

    public static int findTriplet(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i != j) {
                    for (int l = j + 1; l < arr.length; l++) {
                        if (arr[i] + arr[j] + arr[l] == x) {
                            count++;
                        }
                    }
                }
            }

        }
        return count;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = takeInput();
        printlArray(arr);
        System.out.println();
        System.out.println("Enter the expected sum : ");
        int x = sc.nextInt();
        int number = findTriplet(arr, x);
        System.out.println("Result: " + number);


    }
}
