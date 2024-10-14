package com.finalterm;

public class ActivityMD02 {
    public static void main(String[] args) {
        char[][] CDM_array = new char[4][];


        for (int i = 0; i < CDM_array.length; i++){
            CDM_array[i] = new char[i+1];

            for (int j = 0; j < CDM_array[i].length; j++){
                CDM_array [i][j] = '*';

            }
        }

        for (int i = 0; i < CDM_array.length; i++){
            
            for (int j = 0; j < CDM_array[i].length; j++){
                System.out.print(CDM_array[i][j] + " ");

            }
            System.out.println();
        }
    }
}
