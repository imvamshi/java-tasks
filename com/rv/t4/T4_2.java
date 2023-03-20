package com.rv.t4;

public class T4_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 5};
        int firstLarge = arr[0];
        int secondLarge = arr[1];

        if(secondLarge > firstLarge) {
            int temp = secondLarge;
            secondLarge = firstLarge;
            firstLarge = temp;
        }

        for (int i = 2; i < arr.length; i++) {
            if(arr[i] > firstLarge) {
                secondLarge = firstLarge;
                firstLarge = arr[i];
            } else if(arr[i] > secondLarge) {
                secondLarge = arr[i];
            }
        }
        System.out.println("First large = " + Integer.toString(firstLarge));
        System.out.println("Second large = " + Integer.toString(secondLarge));
    }
}
