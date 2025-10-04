package Exercises;

import java.util.Scanner;

public class GradeCalculator {
    //    Write a program that calculates and displays the letter grade for a
    //    given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
//    A: 90-100
//    B: 80-89
//    C: 70-79
//    D: 60-69
//    F: 0-59
    public  static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks");
        if(scanner.hasNextInt()){
            int marks = scanner.nextInt();
            if(marks<=100 && marks>=90){
                System.out.println("A");
            }
            if(marks<=89 && marks>=80){
                System.out.println("B");
            }
            if(marks<=79 && marks>=70){
                System.out.println("C");
            }
            if(marks<=69 && marks>=60){
                System.out.println("D");
            }
            if(marks<=59 && marks>=0){
                System.out.println("F");
            }
        }else {
            System.out.println("Please enter marks in integer");
        }

    }
}
