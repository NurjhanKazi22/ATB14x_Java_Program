package Exercises;

import java.util.Scanner;

public class reverseStringWhileloop {
//    Write a program to reverse a string without using inbuilt functions.
public
static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter String:");
    String s1 = scanner.next();
    System.out.println(s1);
    int i=s1.length()-1;
    String reverse = "";
    while (i>=0){
        reverse += s1.charAt(i);
        i--;
    }
    System.out.println("reverse of String: "+ reverse);
}





}
