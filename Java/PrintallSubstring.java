package com.company;

import java.sql.SQLOutput;
import java.util.*;

public class PrintallSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.next();
        for (int start = 0; start < str.length(); start++) {
            for (int end = start; end < str.length(); end++) {
                System.out.println(str.substring(start, end + 1) + " ");
            }

        }
    }
}
