package com.rv.t7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class T7_3 {
    public static void main(String[] args) {
        int[] arr1 = {8,3,4,1,5};
        int[] arr2 = {4,6,8,7,8};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int no : arr2) {
            set2.add(no);
        }
        for (int no : arr1) {
            set1.add(no);
        }

        set1.retainAll(set2); // wtf is retainAll

        System.out.println("Intersection of two arrays are:");
        for(int setno: set1) {
            System.out.print(Integer.toString(setno) + ", ");
        } System.out.println();

        System.out.println("\nIntersection of two arrays are:");
        for (Iterator<Integer> it = set1.iterator(); it.hasNext();) {
            System.out.println(it.next());
        } System.out.println();

    }
}
