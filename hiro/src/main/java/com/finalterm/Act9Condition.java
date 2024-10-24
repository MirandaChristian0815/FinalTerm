package com.finalterm;

public class Act9Condition {
    public static void main(String[] args) {
        int age = 123;
        if (age > 18){
            System.out.println("Person is Adult");
        }
        else if(age > 4){
            System.out.println("Person is a kid");
        }
        else{
            System.out.println("Person is toddler");
        }
    }
}
