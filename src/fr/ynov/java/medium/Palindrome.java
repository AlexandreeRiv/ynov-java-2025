package fr.ynov.java.medium;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter word: ");
            String word = scanner.next();
            scanner.close();

            if (isPalindrome(word)){
                System.out.println("Palindrome");
            } else{
                System.out.println("Pas Palindrome");
            }
        }catch(Exception e) {
            System.out.println("Exception: " + e);
        }

    }


    public static boolean isPalindrome(String input) {

       input = input.toLowerCase();
       String reversed = "";

       for (int i = input.length() - 1; i >= 0; i--) {
           reversed += input.charAt(i);
       }

       return input.equals(reversed);

    }
}
