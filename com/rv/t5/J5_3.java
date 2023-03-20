package com.rv.t5;

public class J5_3 {
    public static void main(String[] args) {
        String str = "Write a JAVA method to remove all the spaces from the String and return the resultant";
        StringBuilder newString = new StringBuilder();
        for (char ch: str.toCharArray()) {
            if(ch != ' ') {
                newString.append(ch);
            }
            //newString.append((ch != ' ' ? ch : Character.MIN_VALUE));
            // If used '' as empty literal, it will throw java: empty character literal
        }
        System.out.println(newString);
    }
}
