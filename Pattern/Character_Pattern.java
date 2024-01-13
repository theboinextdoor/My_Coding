package com.company;

import java.util.*;

public class Character_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
//            char ch = (char)('A'+n-i);
            while (j <= i) {
                System.out.print((char) ('A' + n - i));

                j++;
            }
            System.out.println();
            i++;
        }

    }
}
