package com.rv.t5;

import java.util.*;

public class T5_7 {

    public static boolean isBalanced(String braces) {
        Stack<Character> stack = new Stack<>();
        for (char c : braces.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String braces1 = "({{)}[}]()";
        boolean result1 = isBalanced(braces1);
        System.out.println("Braces " + braces1 + " is balanced: " + result1);

        String braces2 = "{{( [ ) ] }}";
        boolean result2 = isBalanced(braces2);
        System.out.println("Braces " + braces2 + " is balanced: " + result2);
    }
}
