package com.company;

import java.util.*;

public class LengthOfLastWord {
    public static String takeInput() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        return str;
    }

    public static int wordlength(String str) {

        int length_word = 0;
        String[] word = str.split(" ");
        if (word.length > 0) {
            length_word = word[word.length - 1].length();
        } else {
            length_word = 0;
        }

        return length_word;
    }

    public static void printString(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        String str = takeInput();
        printString(str);
        int len = wordlength(str);
        System.out.println(len);


    }
}
