package com.company;

import java.util.*;

public class Sum_odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int even = 0, odd = 0, digit;
        while (num != 0) {
            digit = num % 10;
            if (digit % 2 == 0) {
                even = even + digit;
            } else {
                odd = odd + digit;
            }
            num = num / 10;
        }
        System.out.println(even + " " + odd);

    }
}
