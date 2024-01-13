package com.company;

import java.util.*;


public class Practice {
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
        for (int i = 0; i < element.length; i++) {
            System.out.print(element[i] + " ");
        }

    }

    public static int[] swap(int[] a) {
        int n = a.length;
        System.out.println();

        for (int i = 0; i < n - 1; i += 2) {
            int x = a[i];
            int y = a[i + 1];
            int temp;
            if (n % 2 == 0) {
                temp = x;
                x = y;
                y = temp;
                System.out.print(x + " " + y + " ");
            } else {
                temp = x;
                x = y;
                y = temp;
                System.out.print(x + " " + y + " ");
            }

        }
        return a;
    }

    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
        int[] arr = takeInput();
        printlArray(arr);
        swap(arr);
    }
}
