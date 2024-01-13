package com.company;

import java.util.Scanner;

public class SmallestNumberinArray {
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] input = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print(i + ": ");
            input[i] = sc.nextInt();
        }
        return input;
    }

    public static void printOutput(int[] arr) {
        int size = arr.length;
        System.out.print("Elements inside the array: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int SmallestNumber(int[] arr) {
        int min = Integer.MAX_VALUE;
        int size = arr.length;

        System.out.print("The smallest number from the array is: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

    }


    public static void main(String[] args) {
        int smalllest[] = takeInput();
        printOutput(smalllest);
        int minNum = SmallestNumber(smalllest);
        System.out.println(minNum);

    }

}
