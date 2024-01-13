package com.company;

import java.util.*;

public class ReverseEachWord {
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
        int currentWordStart = 0;
        String ans = "";
        int i = 0;
        for (; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                int currentWordEnd = i - 1;
                String revereseWord = "";
                for (int j = currentWordEnd; j >= currentWordStart; j--) {
                    revereseWord += str.charAt(j);
                }
                ans += revereseWord + " ";
                currentWordStart = i + 1;
            }
        }
        int currentWordEnd = i - 1;
        String revereseWord = "";
        for (int j = currentWordEnd; j >= currentWordStart; j--) {
            revereseWord += str.charAt(j);
        }
        ans += revereseWord + " ";
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the String : ");
        String str = takeInput();
        System.out.println("\nString before reversing : ");
        printString(str);
        System.out.println("\nString after the reversing  : ");
        String revstring = reverseString(str);
        printString(revstring);

    }
}
