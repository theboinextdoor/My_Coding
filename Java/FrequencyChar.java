package com.company;

import java.util.*;

public class FrequencyChar {

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

    public static void frequency(String str) {

        System.out.println("Character \t frequency");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    count++;
                }
            }
            if (count != 0)
                System.out.println(ch + "\t" + count);
        }
    }


    public static void main(String[] args) {
        System.out.println("Ente the String : ");
        String str = takeInput();
        frequency(str);


    }
}
