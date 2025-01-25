package com.Nivedita.Task3;

public class Car {
    public String brand;
    public String colour;
    public double speed;

    public Car(String brand, String colour, double speed) {
        this.brand = brand;
        this.colour = colour;
        this.speed = speed;
    }

    public Car() {
    }

    public void start(){
        System.out.println("Car has started !");
    }
    public void stop(){
        System.out.println("Car has stopped!");
    }
    public void accelerate(){
        System.out.println("Car is getting accelerated !");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                ", speed=" + speed +
                '}';
    }
}
