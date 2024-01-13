package com.company;

import java.util.*;

public class Zero_one_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;

            while (j <= i) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
