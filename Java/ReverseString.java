package com.company;

import java.util.*;

public class ReverseString {
    public static String takeInput() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        return str;
    }

    public static void printString(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }

    public static String reverseString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (reverse == str) {
            System.out.println("yes");
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        String str = takeInput();
        System.out.println("\nString before Reverse: ");
        printString(str);
        String reverse = reverseString(str);
        System.out.println("\nString After Reverse: ");
        printString(reverse);
        if (str.equals(reverse)) {
            System.out.println("\nYes the String is Palindrom ");
        } else {
            System.out.println("\nNo the number is not palindrome");
        }

    }
}
