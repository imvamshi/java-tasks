package com.rv.t4;


import java.util.HashSet;
import java.util.Set;

public class T4_1 {
    public static void main(String[] args) {
        // Remove dups from the array
        int[] arr = {1, 2, 3, 3, 4, 4, 5};
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
            } else {
                arr[i] = 0;
            }
        }

        System.out.println("Array with duplicates removed:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
