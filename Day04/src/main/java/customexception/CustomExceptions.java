package customexception;

import java.util.Scanner;

public class CustomExceptions {
    static class InvalidAgeException extends  Exception{
        public  InvalidAgeException(String message){
            super(message);
        }
    }

    public static void validateAge(int age) throws InvalidAgeException{
        if (age<18){
            throw new InvalidAgeException("Age must be greater than 18");
        }else {
            System.out.println("you must vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age!!");
        int age = sc.nextInt();
        try {
            validateAge(age);
        } catch (InvalidAgeException e){
            System.out.println("caught custom exception : " + e.getMessage());
        }
    }
}
