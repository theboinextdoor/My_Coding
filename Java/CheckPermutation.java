package com.company;

import java.util.Scanner;

public class CheckPermutation {

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

    public static boolean Permutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] freq = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            ++freq[ch];
        }

        for (int j = 0; j < str2.length(); j++) {
            char ch = str2.charAt(j);
            --freq[ch];
        }

        for (int k = 0; k < 256; k++) {
            if (freq[k] != 0) {
                return false;
            }
        }
        return true;

//        abcde
//        baedc
//        "sinrtg"
//        str2 = "string"
    }


    public static void main(String[] args) {
        System.out.println("\nEnter First String : ");
        String str1 = takeInput();
        System.out.println("\nEnter the second String: ");
        String str2 = takeInput();
        System.out.println("\nFirst String : ");
        printString(str1);
        System.out.println("\nSecond String : ");
        printString(str2);
        boolean ans = Permutation(str1, str2);
        System.out.println("\n" + ans);


    }
}
