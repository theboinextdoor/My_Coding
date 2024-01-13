package com.company;

import java.util.*;

public class FunctionArray {
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void printOutput(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int input[] = takeInput();
        printOutput(input);


    }
}
