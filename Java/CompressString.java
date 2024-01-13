package com.company;

import java.util.Scanner;

public class CompressString {

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

    public static String theCompressedString(String str) {
        int count = 0;
        String ans = "";
        char currentWord = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentWord) {
                count++;
            } else {
                if (count == 1) {
                    ans += currentWord;
                    count = 1;
                    currentWord = str.charAt(i);
                } else {
                    ans += currentWord + "" + count;
                    currentWord = str.charAt(i);
                    count = 1;
                }
            }
        }
        if (count == 1) {
            ans += currentWord;
//            count =1;
//            currentWord= str.charAt(i);
        } else {
            ans += currentWord + "" + count;
//            currentWord=str.charAt(i);
//            count =1;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Enter the String :");
        String str = takeInput();
        System.out.println("Compressed String : ");
        String FinalString = theCompressedString(str);
        printString(FinalString);


    }
}
