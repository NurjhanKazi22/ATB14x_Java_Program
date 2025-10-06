package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class wordInString {
//Count the Number of Words in a String.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter String:");
    String s1 = scanner.nextLine();
    String[] wordsArray = s1.split(" ");
    System.out.printf( "The string Constance %d worlds ",wordsArray.length);

}
}
