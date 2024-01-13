package com.company;

import java.util.*;

public class Inverted_Triangle_pattern {
    public static void main(String[] args) {


//        5 5 5 5 5
//        4 4 4 4
//        3 3 3
//        2 2
//        1

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        int i = 1;
        int k = rows;
        while (i <= rows) {
            int j = 1;
            while (j <= rows - i + 1) {
                System.out.print(k + "   ");
                j++;
            }
            k--;
            System.out.println();
            i++;
        }


//        3.    * * * * * * *
//              * * * * * *
//              * * * * *
//              * * * *
//              * *
//              *

//        System.out.println("Enter the number of rows : ");
//        int rows = sc.nextInt();
//
//        int i=1;
//        while(i<=rows)
//        {
//            int j= 1;
//            while(j<=rows-i+1)
//            {
//                System.out.print("* ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


    }
}
