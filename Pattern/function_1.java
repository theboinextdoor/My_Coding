package com.company;

import java.util.Scanner;

public class function_1 {
    public static int factorial(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            num *= i;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        int num = factorial(n);
        int den1 = factorial(r);
        int den2 = factorial(n - r);

        int ans = num / (den1 * den2);
        System.out.println(ans);


    }
}
