package com.rv.t3;

import java.util.Scanner;

public class T3_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        if (Math.abs(num1 - num2) < 0.01) {
            System.out.println("The numbers are equal up to two decimal places.");
        } else {
            System.out.println("The numbers are not equal up to two decimal places.");
        }
    }
}
