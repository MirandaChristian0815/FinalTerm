package com.finalterm;

public class Act7EscapePlaceholders {
    public static void main(String[] args) {
        System.out.println("Hello\nWorld!");
        System.out.println("\tThis is Dave");
        System.out.println("Welcome to \"National University\"");
        System.out.println("Step\bback");
        System.out.println("Don't be a \ffemale symbol");

        //DavePlaceholder
        int Cdm_num = 7;
        double Point = 17.06;
        char ChanLetter = 'L';
        int Color = 255;
        System.out.printf("The number I inputted is: %d%n", Cdm_num);
        System.out.printf("The second number is: %f", Point);
        System.out.printf("\nThe letter Inputted is: ", ChanLetter);
        System.out.printf("Black or White?: %x", Color);
    

    }
}
