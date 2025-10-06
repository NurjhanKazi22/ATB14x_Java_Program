package Exercises;

import java.util.Scanner;

public class firstWordInString {
    //First Letter of Each Word in a String.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String:");
        String s1 = scanner.nextLine();
        String[] wordsArray = s1.split(" ");
        for (String word:wordsArray) {
            char firstLetterOfWord = word.charAt(0);
            System.out.println(firstLetterOfWord);
        }
    }
}
