package com.rv.t2;

import java.util.Scanner;

public class T2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no;
        no = scanner.nextInt();
        if(no % 2 == 1) {
            System.out.println("NEW");
        } else {
            if(no > 1 && no < 6) System.out.println("OLD");
            else if(no > 5 && no < 31) System.out.println("NEW");
            else System.out.println("OLD");
        }
    }
}
