package Exercises.Test16112025;

public class TestOverride {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        p.display();  // Parent version
        c.display();  // Child version
    }
}

class Parent {
    public void display() {
        System.out.println("Parent class display method");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Child class display method");
    }
}

