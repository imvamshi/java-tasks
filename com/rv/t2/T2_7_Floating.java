package com.rv.t2;

import java.util.Scanner;

public class T2_7_Floating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");
        double num = input.nextDouble();

        if (num == 0) {
            System.out.println("zero");
        } else if (num > 0) {
            System.out.print("positive ");
            if (Math.abs(num) < 1) {
                System.out.println("small");
            } else if (Math.abs(num) > 1000000) {
                System.out.println("large");
            }
        } else {
            System.out.print("negative ");
            if (Math.abs(num) < 1) {
                System.out.println("small");
            } else if (Math.abs(num) > 1000000) {
                System.out.println("large");
            }
        }
    }
}
