package com.company;

import java.util.*;

public class ArrangeElement {
    public static void main(String[] args) {
        int elemnt[] = arrangeElement();
        printtOutput(elemnt);

    }


    public static int[] arrangeElement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        if (n == 0) {
            return arr;
        }
        int x = ((n - 1) / 2) + 1;
        int value = 1;

        for (int i = 0; i < x; i++) {
            arr[i] = value;
            value += 2;
        }

        if (n % 2 == 0) {
            int val = n;
            for (int i = x; i < n; i++) {
                arr[i] = val;
                val -= 2;
            }
        } else {
            int val = n - 1;
            for (int i = x; i < n; i++) {
                arr[i] = val;
                val -= 2;
            }
        }
        return arr;
    }

    public static void printtOutput(int[] arr) {
        System.out.print("Element inside array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
