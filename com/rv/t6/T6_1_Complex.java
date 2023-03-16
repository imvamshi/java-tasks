package com.rv.t6;

import java.util.Scanner;

public class T6_1_Complex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imaginary1 = scanner.nextDouble();
        System.out.print("Enter the real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double imaginary2 = scanner.nextDouble();

        // Compute the sum, difference, and product of the complex numbers
        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);
        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex prod = c1.multiply(c2);

        // Print the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
    }
}

class Complex {
    private double real;
    private double imaginary;

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex add(Complex other) {
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;
        return new Complex(realSum, imaginarySum);
    }

    public Complex subtract(Complex other) {
        double realDiff = this.real - other.real;
        double imaginaryDiff = this.imaginary - other.imaginary;
        return new Complex(realDiff, imaginaryDiff);
    }

    public Complex multiply(Complex other) {
        double realProd = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryProd = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realProd, imaginaryProd);
    }

    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
