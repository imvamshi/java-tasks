package com.rv.t2;

import java.util.Scanner;

public class T2_8_CharInput {
    public static void main(String[] args) {
        char ch;
        Scanner scanner = new Scanner(System.in);
        ch = scanner.next().charAt(0);
        ch = Character.toUpperCase(ch);
        if("RANDOM".indexOf(ch) != -1) {
            System.out.println("Found");
        } else System.out.println("Not found.");


    }
}
