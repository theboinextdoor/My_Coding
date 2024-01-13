package com.company;

import java.util.*;

public class StringApnaCollege {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First Name: ");
        String f_name = sc.next();

        System.out.print("Last Name:");
        String l_name = sc.next();
        System.out.println();

//        Concatination

        String full_name = f_name.toUpperCase() + " " + l_name.toUpperCase();
        System.out.println(full_name);
        System.out.println();


//        length of Array

        System.out.println("Length of the Array is: ");
        System.out.println(full_name.length());
        System.out.println();

//        character At index

        System.out.println("Index and there character: ");
        for (int i = 0; i < f_name.length(); i++) {
            System.out.println(i + ": " + full_name.charAt(i));
        }
        System.out.println();

//        comparing Strig

        System.out.println("Comparing two String : ");
        if (f_name.compareTo(l_name) == 0) {
            System.out.println("Both the Strign are equal.");
        } else {
            System.out.println("Both the String are not equal.");
        }
        System.out.println();


//        SubString

        System.out.println("My name is faraaz");
        String str = "My name is faraaz";
        String sub_string = str.substring(11, str.length());
        System.out.println(sub_string);


    }
}
