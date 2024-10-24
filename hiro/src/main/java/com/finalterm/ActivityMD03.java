package com.finalterm;

public class ActivityMD03 {
    public static void main(String[] args) {
        int CDM_row = 80;

        //outer loop
        for(int i = 0; i < CDM_row; i++){

            for(int j = 0; j < CDM_row - i - 1; j++){
                System.out.print(' ');


            }

            for(int k = 0; k < (2 * i) + 1; k++){
                System.out.print('1');
            }
            System.out.println();
        }
        
    }
}
