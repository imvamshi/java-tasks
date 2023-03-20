package com.rv.t7;

import java.util.HashMap;

public class T7_9 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int sum = 9;

        HashMap<Integer, Integer> hash = new HashMap<>();
        int a = -1, b;

        for (int i = 0; i < arr.length; i++) {
            if(hash.containsKey(sum - arr[i])) {
                a = arr[i];
                break;
            }
            hash.put(arr[i], i);
        }
        if(a == -1) {
            System.out.println("No sum exists");
        } else {
            System.out.println("Two numbers are " + a + ", " + (sum - a));
        }

    }
}
