package com.company;

import java.util.*;

public class FindSmallDifference {

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

    public static int findSmallDiff(int[] a1, int[] a2) {
        int smallDiff = Integer.MAX_VALUE;
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                int diff = a1[i] - a2[j];
                int theAns = Math.abs(diff);
                if (theAns < smallDiff)    //positive ans
                {
                    smallDiff = theAns;
                }
            }
        }
        return smallDiff;
    }


    public static void main(String[] args) {
        System.out.println("\n1st Array: ");
        int[] arr1 = takeInput();
        System.out.println("\n2nd Array: ");
        int[] arr2 = takeInput();
        System.out.println("\n1st Array are: ");
        printArray(arr1);
        System.out.println("\n2nd Array are: ");
        printArray(arr2);
        int num = findSmallDiff(arr1, arr2);
        System.out.println("\nSmallest difference between two array is: " + num);
    }
}
