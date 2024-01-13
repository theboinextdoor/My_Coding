package com.company;

import java.util.*;

public class Stringg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.println("Entre the Second Array: ");
        String str2 = sc.nextLine();

        System.out.println(str1.compareTo(str2));       //compareTo method
        System.out.println(str1.concat(str2));          //concatination
        System.out.println(str1.equals(str2));         //equalsTo
        String ss = str1 + str2;
        System.out.println(ss.substring(0, ss.length() - 1));


//        Print all the character
        System.out.println("Printing all the character: ");
        for (int i = 0; i < ss.length(); i++) {
            System.out.print(ss.charAt(i) + " ");
        }
    }

}
