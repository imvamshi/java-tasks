package com.rv;

import java.util.Scanner;

public class T7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String inp = scanner.next();

        char[] charArray = inp.toCharArray();
        int len = inp.length();
        for(int i = 0; i < len/2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[len - i - 1];
            charArray[len - i - 1] = temp;
        }
        String reversedString = new String(charArray);

        System.out.println("Reversed string: " + reversedString);
    }
}
