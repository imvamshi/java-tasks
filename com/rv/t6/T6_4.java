package com.rv.t6;

import org.w3c.dom.css.Rect;

public class T6_4 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());

        Rectangle r2 = new Rectangle(3);
        System.out.println(r2.toString());

        Rectangle r3 = new Rectangle(4,7);
        System.out.println(r3.toString());
    }
}

class Rectangle {
    private int length;
    private int breadth;
    private int area;

    Rectangle() {
        this.area = 0;
    }

    Rectangle(int length) {
        this.length = length;
        this.breadth = length;
        this.area = length * length;
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        this.area = length * breadth;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", area=" + area +
                '}';
    }
}
