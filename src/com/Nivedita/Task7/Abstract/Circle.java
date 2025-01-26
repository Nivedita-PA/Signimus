package com.Nivedita.Task7.Abstract;

public class Circle extends Shape {
    public final double pi = 3.14;
    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return pi*r*r;
    }
}
