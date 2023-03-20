package com.rv.t4;

public class T4_6 {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,4,4,4,11,11,11,11};

        for (int i = arr.length - 2; i >= 0; i--) {
            if(arr[i] == arr[i + 1]) {
                arr[i + 1] = 0;
            }
        }

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
