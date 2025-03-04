package fr.ynov.java.medium;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        System.out.println("Enter the number for calculating is square : ");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("The square of " + number + " is " + square(number)); //call the methode square for print the result

        sc.close();
    }

    public static int square (int num) {
        num *= num;
        return num;
    }

}
