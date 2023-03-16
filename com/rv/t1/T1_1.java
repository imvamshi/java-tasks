package com.rv.t1;

public class T1_1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;

        System.out.println(a + ", " + Integer.toString(b));

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + ", " + Integer.toString(b));
    }
}
