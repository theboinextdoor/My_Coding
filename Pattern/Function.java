package com.company;

import java.util.*;

public class Function {
    public static int factorial(int n, int r) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            num *= i;
        }

        int den1 = 1;
        for (int i = 1; i <= r; i++) {
            den1 *= i;
        }

        int den2 = 1;
        for (int i = 1; i <= n - r; i++) {
            den2 *= i;
        }

        int ans = num / (den1 * den2);
        System.out.print("The required ans is : ");
        System.out.println(ans);
        return 1;
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases: ");
        int t = sc.nextInt();
        while (t-- > 0) {

            System.out.print("Enter the first num: ");
            int a = sc.nextInt();
            System.out.print("Enter the second num: ");
            int b = sc.nextInt();
            factorial(a, b);
        }


    }
}
