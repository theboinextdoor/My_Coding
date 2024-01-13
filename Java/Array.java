package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Array {
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void printinput(int arr[]) {
        System.out.println("Element inside the array: ");

        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        printinput(arr);


    }
}
