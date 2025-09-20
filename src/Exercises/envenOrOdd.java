package Exercises;

public class envenOrOdd {
    public static void main(String[] args) {

        // Check if the number is even or odd by using Ternary Operator.
        int num = 7;
        String evenOrOdd = num%2==0?"number is even":"number is odd";

        System.out.println(evenOrOdd);
    }
}
