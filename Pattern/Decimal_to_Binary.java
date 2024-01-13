package com.company;

import java.util.*;


public class Decimal_to_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0, pv = 1;

        while (num > 0) {
            int rem = num % 2;
            ans = ans + rem * pv;
            pv *= 10;
            num /= 2;
        }
        System.out.println(ans);

    }
}
