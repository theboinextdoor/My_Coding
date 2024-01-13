package com.company;

import java.util.Scanner;

public class ReverseWordWise {

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

    public static String reverseWord(String str) {
//        "My_Name_is_Damon"
        String reverse = "";
        String ans = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        ans += reverse;

//        ans= zaraf si eman ym

        String newans = "";
        int startIndex = 0;
        int i = 0;
        for (; i < ans.length(); i++) {
            if (ans.charAt(i) == ' ') {
                String newReverse = "";
                int endIndex = i - 1;
                for (int j = endIndex; j >= startIndex; j--) {
                    newReverse += ans.charAt(j);
                }
                newans += newReverse + " ";
                startIndex = i + 1;
            }
        }

//        for last word
        String newReverse = "";
        int endIndex = i - 1;
        for (int j = endIndex; j >= startIndex; j--) {
            newReverse += ans.charAt(j);
        }
        newans += newReverse + " ";
//        startIndex=i+1;
        return newans;
    }

    public static void main(String[] args) {
        System.out.println("\nEnter the String : ");
        String string = takeInput();
        System.out.println("\nBefore Reversing :");
        printString(string);
        System.out.println("\nAfter Reversing :");
        String rev_word = reverseWord(string);
        printString(rev_word);

    }
}
