package com.rv.t1;

import java.util.Scanner;

public class T1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number (between 1-10): ");
        int num1 = input.nextInt();
        System.out.print("Enter second number (between 1-10): ");
        int num2 = input.nextInt();

        int z = num1 + num2;
        z += 30;

        System.out.println("The final result is: " + z);
    }
}
