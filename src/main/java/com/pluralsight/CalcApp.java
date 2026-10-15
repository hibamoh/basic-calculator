package com.pluralsight;
import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int sum;
        int product;
        int differece;
        double quotient;


        System.out.println("enter the first number: ");
        int num1 = myScanner.nextInt();

        System.out.println("enter the second number: ");
        int num2 = myScanner.nextInt();

        System.out.println("what operation would you liked to do (* / + -): ");
        String operator = myScanner.nextLine();

        if (operator == "+") {
            System.out.println("your sum is " + (num1
            + num2));
        }









    }
}
