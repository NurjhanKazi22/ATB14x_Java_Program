package Exercises.Test16112025;

public class Animal {

    public void sound(){
        System.out.println("Animal makes a sounds");
    }

    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.print("Dog says: Woof! Woof! ");
    }
}

class Cat extends Animal{
    @Override
    public void sound() {
        System.out.print("Cat says: Meow! Meow!");
    }
}

