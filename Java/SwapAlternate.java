package com.company;

import java.util.Scanner;

public class SwapAlternate {


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static int[] takeinput() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] element = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print(i + ": ");
            element[i] = sc.nextInt();
        }

        return element;
    }

    public static void swap(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n; i++) {
            int x = arr[i];
            int y = arr[i + 1];
            int temp;
            if (i == n - 1 && i % 2 != 0) {
                System.out.print(i);
            }
            if (i == 0) {
                temp = x;
                x = y;
                y = temp;
                System.out.print(x + " " + y + " ");
            } else if (i % 2 == 0) {
                temp = x;
                x = y;
                y = temp;
                System.out.print(x + " " + y + " ");
            }


        }
    }

    public static void main(String[] args) {
        int[] arr = takeinput();
        printArray(arr);
        swap(arr);


    }
}
