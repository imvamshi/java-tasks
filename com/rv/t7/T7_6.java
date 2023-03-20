package com.rv.t7;

import java.util.Scanner;

public class T7_6 {
    public static void main(String[] args) {
        int number, originalNumber, remainder, result = 0, n = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any positive integer: ");
        number = scanner.nextInt();

        originalNumber = number;

        // counts the number of digits in the input number
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = number;

        // calculates the Armstrong number
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
