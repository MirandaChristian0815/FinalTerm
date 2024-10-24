package com.finalterm;

import java.util.Scanner;

public class Act6Scanner2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);


        System.out.println("Enter your name: ");
        String FName =  Input.nextLine();

        System.out.println("Enter your age: ");
        byte Cdm_Age =  Input.nextByte();

        System.out.println("Enter your height: ");
        double Cdm_Height =  Input.nextDouble();

        System.out.println("Enter your Gender (M for male | F for Female): ");
        char Cdm_gender =  Input.next().charAt(0);

        System.out.println("Are you married? (true/false): ");
        Boolean Married = Input.nextBoolean();

        System.out.println("Your name is :" + FName);
        System.out.println("Your age is :" + Cdm_Age);
        System.out.println("Your height is :" + Cdm_Height);
        System.out.println("Your Gender is :" + Cdm_gender);
        System.out.println("Your marriage status is :" + Married);

        Input.close();
    }
}