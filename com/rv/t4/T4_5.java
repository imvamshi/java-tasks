package com.rv.t4;

public class T4_5 {
    public static void main(String[] args) {
        // Shift zeroes to the end
        int[] arr = {8,3,0,0,4,0,1,5,0,0,0,4,6,8,0,7,8};

        int write = 0;
        int read = 0;
        while(read < arr.length) {
            if(arr[read] != 0) {
                int temp = arr[write];
                arr[write] = arr[read];
                arr[read] = temp;
                write++;
            }
            read++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +  ", " );
        }
    }
}