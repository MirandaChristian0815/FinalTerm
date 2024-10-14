package com.finalterm;

public class ActMultiplicationTable {
    public static void main(String[] args) {
        int[][] table = new int[10][10];

        // Fill the array with the multiplication values
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                table[i][j] = (i + 1) * (j + 1); // Store the product of (i+1)*(j+1)
            }
        }

        // Print the multiplication table
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%4d", table[i][j]); // Print each value with a fixed width
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
