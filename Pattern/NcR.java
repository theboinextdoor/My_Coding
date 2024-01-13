package com.company;

import java.util.*;

public class NcR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();


        double num = 1;
        for (int i = 1; i <= n; i++) {
            num *= i;      //n!  factorial of n
        }

        double den1 = 1;
        for (int i = 1; i <= r; i++) {
            den1 *= i;     //r! factorial of r
        }

        double den2 = 1;
        for (int i = 1; i <= n - r; i++) {
            den2 *= i;        //(n-r)!    factorial of (n-r)
        }

        double ans = num / (den1 * den2);
        System.out.println(ans);

    }
}
