package com.company;

import java.util.*;

public class Diamond_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of diamond ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
//            spaces
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
//            spaces
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
