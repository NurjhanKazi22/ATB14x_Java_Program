package Exercises;

public class ageClassification {
    public static void main(String[] args) {
        //Real_Age_Classification (  age → 59 ) →  Minor, Adult (Adult , Sr Senior) - Ternary Operator
        int age = 7;

        String ageClassification = age<18 ? "You are minor": age>18 && age<65? "You are adult": "You are Seniors";
        System.out.println(ageClassification);
    }
}
