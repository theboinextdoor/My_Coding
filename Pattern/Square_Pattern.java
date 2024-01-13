package com.company;

import java.sql.SQLOutput;
import java.util.*;

public class Square_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//       1.  Square Pattern
//        * * * *
//        * * * *
//        * * * *
//        * * * *


//        System.out.print("Enter the number of rows : ");
//        int rows = sc.nextInt();
//        System.out.print("Enter the number of column: ");
//        int col = sc.nextInt();
//        for(int i=1; i<=rows; i++)
//        {
//            for(int j= 1;j<=col; j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//------------------------------------------------------------------------------------------------------------------------

//        2. Number Square Pattern
//        1 1 1 1
//        2 2 2 2
//        3 3 3 3
//        4 4 4 4

//        System.out.print("Enter the number of rows: ");
//        int rows = sc.nextInt();
//        System.out.print("Enter the number of col: ");
//        int col = sc.nextInt();
//
//        for(int i=1; i<=rows ; i++)
//        {
//            for(int j= 1; j<=col; j++)
//            {
//                System.out.print(i);
//            }
//            System.out.println();
//        }

// ----------------------------------------------------------------------------------------------------------------------------------------

//        1 2 3 4
//        1 2 3 4
//        1 2 3 4
//        1 2 3 4

//        System.out.print("Enter the number of rows : ");
//        int rows = sc.nextInt();
//        System.out.print("Enter the number o column : ");
//        int col = sc.nextInt();
//
//        for(int i=1; i<rows; i++)
//        {
//            for(int j= 1; j<=col;j++)
//            {
//                System.out.print(j+ " ");
//            }
//            System.out.println();
//        }

// -----------------------------------------------------------------------------------------------------------------------

//        4 3 2 1
//        4 3 2 1
//        4 3 2 1
//        4 3 2 1

        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of column: ");
        int col = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = col; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


}
