package com.finalterm;

import java.util.Scanner;
public class MachineProblem2CDM {
    public static void main(String[] args) {
        Scanner CDMscanner = new Scanner(System.in);
    
    // Input the price of the item
    System.out.print("Enter the price of the item: ");
    double CDMprice = CDMscanner.nextDouble();
    
    // Input the quantity of items sold
    System.out.print("Enter the quantity sold: ");
    int CDMquantity = CDMscanner.nextInt();
    
    // Calculate the total revenue (price * quantity)
    double CDMtotalRevenue = CDMprice * CDMquantity;
    

    
    System.out.printf("Total revenue: %.2f", CDMtotalRevenue);
    
    CDMscanner.close();

        
    }
}

