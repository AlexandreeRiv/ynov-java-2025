package fr.ynov.java.easy;

import java.util.Scanner;

public class    Calculator {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please enter correct number");
        }

        //choose double for number with 1 number after the . like 1.0
        double num1 = Double.parseDouble(args[0]); // take the params from args1
        double num2 = Double.parseDouble(args[1]);

        System.out.print("Choose the operator +,-,*,/ : ");
        Scanner sc = new Scanner(System.in); // recover the operator
        String operator = sc.next();
        //switch case for all the operator
        switch (operator) {

            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("You cannot divide by zero");
                    break;
                }
                System.out.println(num1 / num2);
                break;
        }

        sc.close();
    }
}
