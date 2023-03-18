package com.rv.t6;

public class T6_6 {
    public static void main(String[] args) {
        Programming obj1 = new Programming(); // prints "I love programming languages"
        Programming obj2 = new Programming("Java"); // prints "I love Java"
        Programming obj3 = new Programming("Python"); // prints "I love Python"
    }
}

class Programming {

    public Programming() {
        System.out.println("I love programming languages");
    }

    public Programming(String language) {
        System.out.println("I love " + language);
    }
}
