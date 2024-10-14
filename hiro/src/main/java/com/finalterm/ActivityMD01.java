package com.finalterm;

public class ActivityMD01 {
    public static void main(String[] args) {

        char[][] CDM_array = new char[10][4];

        for(int i = 0; i < CDM_array.length; i++){
            for(int j = 0; j < CDM_array[i].length; j++){

                CDM_array[i][j] = '5';
            }
        }

        for(int i = 0; i < CDM_array.length; i++){
            for(int j = 0; j < CDM_array[i].length; j++)
            {

                System.out.print(CDM_array[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
