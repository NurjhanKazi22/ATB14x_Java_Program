package Exercises.Test16112025;


public class Vehicle {

    public void start(){
        System.out.println("Animal makes a sounds");
    }

    public static void main(String[] args) {
        Vehicle a1 = new Car();
        Vehicle a2 = new Bike();

        a1.start();
        a2.start();
    }
}

class Car extends Vehicle {
    public void start() {
        System.out.print("Car engine starts with a roar! ");
    }
}

class Bike extends Vehicle{
    @Override
    public void start() {
        System.out.print("Bike engine starts with a purr!");
    }
}

