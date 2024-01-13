package com.company;

import java.util.*;

public class Triangle_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        System.out.println("Enter the number of rows : ");
//        int rows = sc.nextInt();
//
//        for(int i=1; i<=rows; i++)
//        {
//            for(int j=1; j<=i; j++)
//            {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }


// --------------------------------------------------------------------------------------------------------------------
//        1
//        1 2
//        1 2 3
//        1 2 3 4

//        System.out.println("Enter the number of rows : ");
//        int rows = sc.nextInt();
//
//        for(int i=1; i<=rows; i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(j+ " ");
//            }
//            System.out.println();
//        }

// --------------------------------------------------------------------------------------------------------------------

//        1
//        2 3
//        3 4 5
//        5 6 7 8

        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            int temp = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
                temp++;
            }
            System.out.println();
        }


    }
}
