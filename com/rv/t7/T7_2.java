package com.rv.t7;

import java.util.Scanner;

public class T7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = "abracadabra";
        // First non repeating character
        int[] lastOccurence = new int[26];

        for (int i = 0; i < 26; i++) {
            lastOccurence[i] = -1;
        }
        System.out.println(Integer.toString(str.charAt(1) - 'a'));
        char ans = '-';
        for(int i = 0; i < str.length(); i++) {
            if(lastOccurence[str.charAt(i) - 'a'] == -1) {
                ans = str.charAt(i);
            }
            lastOccurence[str.charAt(i) - 'a'] = i;
        }
        System.out.println("First non repeated character is " + Character.toString(ans));
    }
}
