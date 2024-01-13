package com.company;

import java.util.*;

public class MergingSortedArray {

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + ": ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        int size = array.length;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] merge(int[] array1, int[] array2) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] ans = new int[array1.length + array2.length];
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                ans[k] = array1[i];
                i++;
                k++;
            } else {
                ans[k] = array2[j];
                j++;
                k++;
            }
        }

        while (i < array1.length) {
            ans[k] = array1[i];
            i++;
            k++;
        }

        while (j < array2.length) {
            ans[k] = array2[j];
            j++;
            k++;
        }

        return ans;
    }


    public static void sorting(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        System.out.println("\n1st Array: ");
        int[] arr1 = takeInput();
        System.out.println("\n2nd Array: ");
        int[] arr2 = takeInput();
        System.out.println("\nArray 1: ");
        sorting(arr1);
        System.out.println("\nArray 2: ");
        sorting(arr2);

        System.out.println("\nFinal Output After Merging : ");
        int[] sorting = merge(arr1, arr2);
        printArray(sorting);


    }
}
