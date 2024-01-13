package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class HellowWorld {
    static int total_salary(int b_s, char g) {
        int allow = 0;
        if (g == 'A') {
            allow = allow + 1700;
        } else if (g == 'B') {
            allow = allow + 1500;
        } else {
            allow = allow + 1300;
        }

        int hra = (b_s) * 20 / 100;
        int da = (b_s) * 50 / 100;
        int pf = (b_s) * 11 / 100;

        int ts = b_s + hra + da + allow - pf;
        return ts;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Write a program to calculate the total salary of a person. The user has to enter
//        the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -

//        totalSalary = basic + hra + da + allow – pf
//
//        where :
//        hra   = 20% of basic
//        da    = 50% of basic
//        allow = 1700 if grade = ‘A’
//        allow = 1500 if grade = ‘B’
//        allow = 1300 if grade = ‘C' or any other character
//        pf    = 11% of basic.
        System.out.println("Enter the base Salary: ");
        int basic_salary = sc.nextInt();
        System.out.println("Enter the Grade : ");
        char grade = sc.next().charAt(0);
//        total_salary(basic_salary,grade);
        System.out.println(total_salary(basic_salary, grade));


    }
}
