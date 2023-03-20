package com.rv.t5;

public class T5_1 {
    public static int findShortestWordLength(String words) {
        String[] wordArray = words.split("\\s+");
        int shortestLength = Integer.MAX_VALUE;
        for (String word : wordArray) {
            int length = word.length();
            if (length < shortestLength) {
                shortestLength = length;
            }
        }
        return shortestLength;
    }

    public static void main(String[] args) {
        String words = "Write JAVA program that takes given String  words and returns  length  the shortest word";
        int shortestLength = findShortestWordLength(words);
        System.out.println("The length of the shortest word is: " + shortestLength);
    }
}
