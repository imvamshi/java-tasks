package com.rv.t7;

import java.util.HashSet;
import java.util.Set;

public class T7_8 {
    public static void main(String[] args) {
        int[] arr = {8,3,1,1,5,1,6,1,1,7,8};
        Set<Integer> set = new HashSet<Integer>();
        for (int no: arr) {
            set.add(no);
        }
        System.out.println("Old length is " + Integer.toString(arr.length));
        arr = set.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("New length is " + Integer.toString(arr.length));

        // learn more about set streams, mapping etc
    }
}
