package com.finalterm;
import java.util.Scanner;

public class Act2Scanner {
    public static void main(String[] args) {

        System.out.println("WELCOME TO ITE104");
        System.out.println("THIS IS DAVE");
        
        int cdm_a = 815;
        int cdm_b = 616;
        String Operation_a = "Addition ";
        String Operation_b = "Subtraction ";
        int cdm_sum = cdm_a + cdm_b;
        int cdm_dif = cdm_a - cdm_b;

        System.out.println(Operation_b + ": " + cdm_dif); //Prints out sum
        System.out.println(Operation_a + ": " + cdm_sum); //Prints out difference

        Scanner cdmScanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = cdmScanner.nextLine();

        System.out.print("Enter your age: ");
        int age = cdmScanner.nextInt();

        System.out.println("Hello, " + name + ". You are " + age + " years old.");

        cdmScanner.close();

        // Add Variable
    }
}

