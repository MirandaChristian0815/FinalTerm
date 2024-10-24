package com.finalterm;

public class ActivityMD04 {
    public static void main(String[] args) {
        int CDM_row = 25;

        // outer loop for rows
        for (int i = 0; i < CDM_row; i++) {

            
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }

          
            for (int k = 0; k < (2 * (CDM_row - i) - 1); k++) {
                System.out.print('*');
            }

            // new line after each row
            System.out.println();
        }
    }
}
