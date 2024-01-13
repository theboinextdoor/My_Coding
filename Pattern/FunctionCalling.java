package com.company;

import java.util.*;

public class FunctionCalling {
    public static boolean PrimeNum(int n) {
        int d = 2;
        while (d < n) {
            if (n % d == 0) {
                return false;
            }
            d++;
        }
        return true;
    }

    public static void primeTilln(int n) {
        for (int i = 2; i <= n; i++) {
            boolean isIprime = PrimeNum(i);    //calling function from line num 5.
            if (isIprime) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        primeTilln(num);                      //calling function for line num 19.
    }
}
