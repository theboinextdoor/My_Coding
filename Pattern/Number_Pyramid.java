package com.company;

import java.util.*;

public class Number_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
//            spaces
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

//            numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "   ");

            }


            System.out.println();
        }
    }
}
