/*Input: Take marks obtained (out of 100) in each subject.
Calculate Total Marks: Sum up the marks obtained in all subjects.
Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
average percentage.
Grade Calculation: Assign grades based on the average percentage achieved.
Display Results: Show the total marks, average percentage, and the corresponding grade to the user

 */

import java.util.Scanner;

class GradeCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of marks: ");
        int n = scan.nextInt();
        int total = 0;
        int[] marks = new int[n];

        System.out.println("Enter the marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = scan.nextInt();
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid input, Enter marks between 0 and 100:");
                marks[i] = scan.nextInt();
            }
        }

        //To find total
        for (int i = 0; i < n; i++) {
            total += marks[i];
        }

        System.out.println("Total marks : " + total + " out of " + (n * 100));

        //to find average
        double average = (double) total / n;

        System.out.println("Average = " + average);

        //Grade calculation
        if (average >= 90) {
            System.out.println("Your grade: A+");
        } else if (average >= 80) {
            System.out.println("Your grade: A");

        } else if (average >= 70) {
            System.out.println("Your grade: B+");
        } else if (average >= 60) {
            System.out.println("Your grade: B");
        } else if (average >= 50) {
            System.out.println("Your grade: C+");

        } else if (average >= 40) {
            System.out.println("Your grade: C ");
        } else {
            System.out.println("Your grade: D");
        }

    }

}
