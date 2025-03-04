package fr.ynov.java.easy;

import java.util.Scanner;

public class ScanMe {
    public static void main(String[] args) {
        System.out.println("What's your age?");
        Scanner sc = new Scanner(System.in); // create a Scanner object
        int age = sc.nextInt(); // Read user input with integer
        System.out.println("What's your name?");
        Scanner sc1 = new Scanner(System.in);
        String firstName = sc1.next(); // Read user input
        sc.close(); // close the object Scanner
        sc1.close();
        System.out.println("Your name : "+firstName + "  Age : " + age );
    }
}
