package com.Nivedita.Task19;

abstract class Rectangle implements Shape{
 protected int width;
 protected int height;

 public Rectangle(int width, int height) {
  this.width = width;
  this.height = height;
 }
 static class Circle implements Shape{
  public Circle(int radius) {
   this.radius = radius;
  }

  private int radius;

  @Override
  public void calculateArea() {
   System.out.println(3.14*radius*radius);
  }
 }

 public static void main(String[] args) {
  Rectangle rectangle = new Rectangle(10,5) {
   @Override
   public void calculateArea() {
    System.out.println(width*height);
   }
  };
  rectangle.calculateArea();
  Rectangle.Circle circle = new Rectangle.Circle(5);
  circle.calculateArea();
 }
}
