package com.org.example;

public class Circle implements Cloneable{
    Point point;
    int radius;

    public Circle(int x, int y, int radius) {
        this.radius = radius;
        point = new Point(x, y);
    }

    public String toString() {
        return "원점은 " + point + "이고, " + "반지름은 " + radius + "입니다.";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
