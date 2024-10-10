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
        CDMIn.close(); // Close the scanner
    }
}
