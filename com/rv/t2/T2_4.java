package com.rv.t2;

import java.util.Scanner;

public class T2_4 {
    public static void main(String[] args) {
        int no;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            no = scanner.nextInt();
            if(no < 0) {
                System.out.println("It's over");
                break;
            } else {
                System.out.println("Good going!");
            }
        }
    }
}
