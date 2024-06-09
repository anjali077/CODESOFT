import java.util.*;

public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Students: ");
        int number = sc.nextInt();

        int[] grades = new int [number];

        for(int i=0; i<number; i++){
            System.out.print("Enter the Grdaes " + (i+1) + ": ");
            grades[i] = sc.nextInt();
        }

        int total = 0;
        for(int i=0; i<number; i++){
            total += grades[i];
        }
        double average = (double) total/number;
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        double averagePercentage = (average / 100) * 100;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Corresponding Grade: " + grade);
    }
}