package rvt.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter a number: ");

        try {
            number = scanner.nextInt();
            System.out.println("Square of the number is " + number * number);
            
        } catch (InputMismatchException e) {
            System.out.println("Wrong data...");
            System.out.println("Try again!");
            main(null);
        }
        System.out.println("Shutdown...");
    }
}

