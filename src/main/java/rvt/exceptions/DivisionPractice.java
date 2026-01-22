package rvt.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionPractice {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Double numerator;
        Double divisor;

        while (true) {
            try {
                System.out.println("Enter the numerator: ");

                String numeratorInput = scan.nextLine().trim();
                if (numeratorInput.equalsIgnoreCase("quit")) {
                    System.out.println(" ");
                    break;
                }

                numerator = Double.parseDouble(numeratorInput);

               System.out.println("Enter the divisor: ");
               String divisorInput = scan.nextLine().trim();
               divisor = Double.parseDouble(divisorInput);

                if ( divisor == 0 ) throw new ArithmeticException();

               System.out.println(numerator + " / " + divisor + " is " + numerator / divisor);
            } catch (InputMismatchException e) {
                System.out.println("You entered bad data.");
                System.out.println("Please try again.");
                scan.nextLine();
            } catch (ArithmeticException e){
              System.out.println("You can't divide by zero!!!");  
            } 
        }
    
    }
    
}


/*
requirments:
Make a program: 
Enter the numerator: 12
Enter the divisor:  4
12 / 4 is 3

Enter the numerator: 12
Enter the divisor  : 0
You can't divide 12 by 0

Enter the numerator: glarch
You entered bad data.
Please try again.

Enter the numerator: quit
*/