package com.rv.t6;

public class T6_3_Student {
    public static void main(String[] args) {
        Student s1 = new Student("Rohit");
        Student s2 = new Student();
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}

class Student {
    private String name;

    Student() {
        this.name = "Unknown";
    }
    Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
