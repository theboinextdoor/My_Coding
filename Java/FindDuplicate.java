package com.company;

import java.util.*;

public class FindDuplicate {
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

    public static int findDuplicate(int[] arr) {
        int size = arr.length;
        int num = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        count++;

                    }
                }

            }
            if (count == 2) {
                count = num + arr[i];
                break;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        int arr[] = takeInput();
        printlArray(arr);
        int dup_name = findDuplicate(arr);
        System.out.println("\nDuplicate number inside the array is : " + dup_name);

    }
}
