package com.company;

import java.util.Scanner;

public class SortZeroandOne {
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
        System.out.print("Array are : ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static int[] sortzeroandone(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = size - 1; j > i; j--) {
//               int x= arr[i];
//               int y= arr[j];
                if (arr[i] == 1 && arr[j] == 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        printArray(arr);
        int[] num = sortzeroandone(arr);
        printArray(num);


    }
}
