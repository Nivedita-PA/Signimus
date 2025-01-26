package com.Nivedita.Task7.Abstract;

public class Rectangle extends Shape {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a*b;
    }


}
