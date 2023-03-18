package com.rv.t7;

public class T7_4 {
    public static boolean hasUniqueCharacters(String str) {
        int[] count = new int[26];
        for (char c: str.toCharArray()) {
            count[c - 'a']++;
        }
        for (int count_it: count) {
            if(count_it > 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "qwerty";
        String str2 = "qwertyq";
        System.out.println(hasUniqueCharacters(str) ? "Unique" : "Non-unique");
        System.out.println(hasUniqueCharacters(str2) ? "Unique" : "Non-unique");
    }
}
