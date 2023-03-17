package com.rv.t6;

public class T6_2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Robert", 1994, "64C- Walls Streat");
        Employee e2 = new Employee("Sam", 2000, "68D- Walls Streat");
        Employee e3 = new Employee("John", 1999, "26B- Walls Streat");

        System.out.println("Name" + '\t' + "Year of joining" + '\t' + "Address");
        System.out.println(e1.toString());;
        System.out.println(e2.toString());;
        System.out.println(e3.toString());;
    }
}

class Employee {
    private String name;
    private int year;
    private String address;

    public Employee(String name, int year, String address) {
        this.name = name;
        this.year = year;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + '\t' + year + '\t' + address + '\n';
    }
}
