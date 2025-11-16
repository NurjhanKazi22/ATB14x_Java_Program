package Exercises.Test16112025;

public class TestOuter {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();
    }
}

class Outer {
    private int x = 10;

    // Inner class
    class Inner {
        public void show() {
            System.out.println("Inner class accessing outer variable: " + x);
        }
    }

    public void display() {
        System.out.println("Outer class variable x: " + x);

        // Creating Inner class object inside Outer class
        Inner inner = new Inner();
        inner.show();
    }
}

