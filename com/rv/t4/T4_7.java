package com.rv.t4;

public class T4_7 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 1, 7};
        int diff = getDifference(arr);
        System.out.println("The difference is: " + diff);
    }

    public static int getDifference(int[] arr) {
        if (arr.length < 1) {
            throw new IllegalArgumentException("Array must be greater than 1");
        }

        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max - min;
    }
}
