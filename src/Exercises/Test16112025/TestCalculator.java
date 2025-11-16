package Exercises.Test16112025;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.add(5, 3);        // Integer addition: 8
        calc.add(2.5, 3.7);    // Double addition: 6.2
        calc.add(1, 2, 3);     // Three integers addition: 6
    }
}

class Calculator {

    // Method 1: Add two integers
    public int add(int a, int b) {
        System.out.println("Integer addition: " + (a + b));
        return a + b;
    }

    // Method 2: Add two doubles
    public double add(double a, double b) {
        System.out.println("Double addition: " + (a + b));
        return a + b;
    }

    // Method 3: Add three integers
    public int add(int a, int b, int c) {
        System.out.println("Three integers addition: " + (a + b + c));
        return a + b + c;
    }
}
