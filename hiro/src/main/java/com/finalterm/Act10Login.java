package com.finalterm;

import java.util.Scanner;;

public class Act10Login {
    public static void main(String[] args) {
        Scanner ChanInput = new Scanner(System.in);
        String Username = "HIROKAZE";
        String Password = "12345";
        
        System.out.print("Enter Username: ");
        String EnteredUserName = ChanInput.nextLine();

        System.out.print("Enter Password: ");
        String EnteredPassword =  ChanInput.nextLine();

        if(EnteredUserName.equals(Username) && EnteredPassword.equals(Password)){
            System.out.println("Welcome! "+ Username);

        }
        else{
            System.out.println("Login Failed! Invalid Credentials!");
        }



        ChanInput.close();
    }
}
