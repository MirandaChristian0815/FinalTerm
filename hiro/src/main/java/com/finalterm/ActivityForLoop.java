package com.finalterm;
import java.util.Scanner;

public class ActivityForLoop {
    public static void main(String[] args) {
        Scanner CDMIn = new Scanner(System.in);
        
        double[] grades = new double[5];
        String[] Subject = {
            "Understanding the Self", 
            "Purposive Communication", 
            "Introduction to Computing", 
            "Fundamentals of Programming", 
            "Readings in Philippine History"
        };

        System.out.print("Enter grade of the following subjects: \n");

        for (int i = 0; i < Subject.length; i++) {
            double CDMgrade;

            do {
                System.out.print(Subject[i] + " : ");
                while (!CDMIn.hasNextDouble()) {
                    System.out.println("Invalid Input! Please enter a number.");
                    CDMIn.next(); // Consume invalid input
                }
                CDMgrade = CDMIn.nextDouble();
                if (CDMgrade < 65 || CDMgrade > 100) {
                    System.out.println("Invalid number! Please enter a grade between 65 and 100.");
                }
            } while (CDMgrade < 65 || CDMgrade > 100); // Ensure valid grade input

            grades[i] = CDMgrade; // Store valid grade
        }

        System.out.println("\nThe grades for the subjects are as follows:");
        for (int i = 0; i < Subject.length; i++) {
            System.out.println(Subject[i] + ": " + grades[i]);
        }

        // Calculate the total sum and average
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.length;

        // Display the total sum and average grade
        System.out.println("Average Grade: " + average);

        System.out.print("\nThe grade classification:\n");
        for (int i = 0; i < grades.length; i++) {
            char CDMGradeClassification;
            if (grades[i] >= 90) {
                CDMGradeClassification = 'A';
            } else if (grades[i] >= 80) {
                CDMGradeClassification = 'B';
            } else if (grades[i] >= 70) {
                CDMGradeClassification = 'C';
            } else if (grades[i] >= 65) {
                CDMGradeClassification = 'D';
            } else {
                CDMGradeClassification = 'F'; // Added classification for grades below 65
            }

            System.out.println(Subject[i] + " : " + grades[i] + " ---> " + CDMGradeClassification);
        }
        //checking for subs below 75

        System.out.println("\nSubjects below 75: ");
        for (int i = 0; i < Subject.length; i++ ){
            if (grades[i] < 75){
                System.out.println(Subject[i] + " : " + grades[i]);
            }
        }
        double CDM_MaxGrade = grades[0];
        double CDM_MinGrade = grades[0];
        String CDM_Maxsub = Subject[0];
        String CDM_Minsub = Subject[0];

        for (int i = 0; i < grades.length; i++){
            if(grades[i] > CDM_MaxGrade){
                CDM_MaxGrade = grades[i];
                CDM_Maxsub = Subject[i];

            }
        }

        for (int i = 0; i < grades.length; i++){
            if(grades[i] < CDM_MinGrade){
                CDM_MinGrade = grades[i];
                CDM_Minsub = Subject[i];
            }
        }
        System.out.println("\nHighest Grade: " + CDM_Maxsub + " : " + CDM_MaxGrade);
        System.out.println("\nLowest Grade: " + CDM_Minsub + " : " + CDM_MinGrade);
        CDMIn.close(); // Close the scanner
    }
}
