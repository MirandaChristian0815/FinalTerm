package com;
import java.util.Scanner;

public class ActivityArray {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);

        int[] grade = {75, 86, 84, 90, 87};

        System.out.println("Initial grade: ");
        System.out.println("Subject 1: " + grade[0]);
        System.out.println("Subject 2: " + grade[1]);
        System.out.println("Subject 3: " + grade[2]);
        System.out.println("Subject 4: " + grade[3]);
        System.out.println("Subject 5: " + grade[4]);

        System.out.print("Enter Student Index: ");
        int StIndex = In.nextInt();
        In.nextLine();

        System.out.print("Enter new grade: ");
        int StudentGrade = In.nextInt();
        In.nextLine();

        grade[StIndex] = StudentGrade;

        System.out.println("Updated grade: ");
        System.out.println("Subject 1: " + grade[0]);
        System.out.println("Subject 2: " + grade[1]);
        System.out.println("Subject 3: " + grade[2]);
        System.out.println("Subject 4: " + grade[3]);
        System.out.println("Subject 5: " + grade[4]);

        System.out.println("Total number of subjects: " + grade.length);

        int totalgrade = 0;
        for(int i = 0; i < grade.length; i++){

            totalgrade += grade[i];

        }
        double average = (double)totalgrade / grade.length;

        System.out.println("The average grade is " + average);
        In.close();


    }
}

