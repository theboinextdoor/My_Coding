package com.company;

import java.util.*;

public class LinearSearch {
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] input = new int[size];

        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }

        return input;
    }

    public static void printOutput(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int LinearSearch(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to check: ");
        int x = sc.nextInt();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] search = takeInput();
        printOutput(search);
        int lSearch = LinearSearch(search);
        System.out.println("required number is at " + lSearch + " position");
    }
}
