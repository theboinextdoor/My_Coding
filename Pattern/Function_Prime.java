package com.company;

import java.util.*;

public class Function_Prime {
    public static boolean prime(int n) {
        int d = 2;
        while (d < n) {
            if (n % d == 0) {
                return false;
            }
            d++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        prime(num);
        System.out.println(prime(num));

    }
}
