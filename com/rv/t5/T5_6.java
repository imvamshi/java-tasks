package com.rv.t5;

public class T5_6 {
    public static String swapCase(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String input = "JavaVirtualMachines";
        String output = swapCase(input);
        System.out.println(output);
    }
}
