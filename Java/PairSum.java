package com.company;

import java.util.*;

public class PairSum {

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

    //2 8 10 5 -2 5
//    1 3 6 2 5 4 3 2 4
    public static int findPairSum(int[] arr, int x) {
        int size = arr.length;
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] + arr[j] == x) {
                    count++;
                }
            }
        }


        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = takeInput();
        printlArray(arr);
        System.out.println("Enter the expected sum: ");
        int x = sc.nextInt();
        int num = findPairSum(arr, x);
        System.out.println("result: " + num);


    }
}
