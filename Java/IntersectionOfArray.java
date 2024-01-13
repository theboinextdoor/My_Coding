package com.company;

import java.util.*;

public class IntersectionOfArray {

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
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

        for (int i = 0; i < element.length; i++) {
            System.out.print(element[i] + " ");
        }
    }

    public static void findIntersection(int[] a1, int[] a2) {
        int s1 = a1.length, s2 = a2.length;
        System.out.println("Intersection of array are : ");
        for (int i = 0; i < s1; i++) {
            for (int j = 0; j < s2; j++) {

                if (a1[i] == a2[j]) {
                    System.out.print(a1[i] + " ");
                    break;
                }
            }

        }
    }

    public static void main(String[] args) {
        int arr1[] = takeInput();
        int arr2[] = takeInput();
        printlArray(arr1);
        printlArray(arr2);
        findIntersection(arr1, arr2);

    }
}
