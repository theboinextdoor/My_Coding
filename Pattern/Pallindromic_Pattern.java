package com.company;

import java.util.*;

public class Pallindromic_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
//            spaces
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print("   ");
            }

//           left half Numbers
            int k = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(k + "  ");
                k--;
            }

//            Right Half Numbers


            int l = 2;
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(l + "  ");
                l++;
            }


            System.out.println();
        }

    }
}
