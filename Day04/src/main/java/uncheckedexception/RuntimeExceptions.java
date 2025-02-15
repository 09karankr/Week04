package uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =0;
        int b = 0;
        boolean validInput = false;

        // input a and validation
        while (!validInput){
            System.out.println("Enter first number");
            try {
                a = sc.nextInt();
                validInput = true;
            } catch (InputMismatchException e){
                System.out.println("Invalid input, Please enter an integer");
                sc.next();
            }
        }
        validInput = false;
        while (!validInput){
            System.out.println("Enter second number");
            try {
                b = sc.nextInt();
                validInput = true;
            } catch (InputMismatchException e){
                System.out.println("Invalid input, Please enter an integer");
                sc.next();
            }
        }
        try {
            int c =a/b;
            System.out.println(c);
        } catch (ArithmeticException e){
            System.out.println("Division by zero leads to infinite");
        } finally {
            sc.close();
        }
    }
}
