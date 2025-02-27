package TernaryOperator;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = scan.nextInt();

        String grade = (marks > 80) ? "High" : (marks > 50) ? "Moderate" : "Low";

        System.out.println("Your marks "+marks+" Grade is: "+grade);
    }
}
