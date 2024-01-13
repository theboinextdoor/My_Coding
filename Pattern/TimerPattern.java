package com.company;

import java.util.Scanner;

public class TimerPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n;
        int q = n;
        for (int i = 1; i <= n; i++) {

//            spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

//            numbers

            for (int j = 1; j <= (n - i) + 1; j++) {
                System.out.print(k);
            }
            k--;

            for (int j = i; j < n; j++) {
                System.out.print(q);
            }
            q--;


            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                continue;
            } else {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            for (int j = 1; j <= i - 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}


