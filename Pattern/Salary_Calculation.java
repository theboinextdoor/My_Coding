package com.company;

import java.util.*;
import java.lang.Math;

public class Salary_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base salary: ");
        float bs = sc.nextInt();
        System.out.println("Enter the grade : ");
        char gr = sc.next().charAt(0);
        int allow = 0;
        if (gr == 'A') {
            allow = allow + 1700;
        } else if (gr == 'B') {
            allow = allow + 1500;
        } else {
            allow = allow + 1300;
        }

        float hra = (bs) * 20 / 100;
        float da = (bs) * 50 / 100;
        float pf = (bs) * 11 / 100;

        float total_sal = bs + hra + da + allow - pf;
        System.out.println(Math.round(total_sal));
    }

}
