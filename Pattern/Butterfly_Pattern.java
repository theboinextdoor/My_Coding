package com.company;

import java.util.*;

public class Butterfly_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


//        upper half
        for (int i = 1; i <= n; i++) {

//          left star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

//          spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

//            right star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        //lower  half
        for (int i = n; i >= 1; i--) {

//          left star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

//          spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

//            right star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
