package com.rv.t3;

import java.util.Scanner;

public class T3_10_Pascals {
    public static void main(String[] args) {
        /* Pascals Triangle */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = input.nextInt();

        int[][] triangle = new int[numRows][numRows];

        for (int i = 0; i < numRows; i++) {
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }

        }

        for (int i = 0; i < numRows; i++) {
            for(int sp = 0; sp < (numRows - i ); sp++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
