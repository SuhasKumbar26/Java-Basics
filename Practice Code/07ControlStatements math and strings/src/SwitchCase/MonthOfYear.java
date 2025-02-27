package SwitchCase;

import java.util.Scanner;

public class MonthOfYear {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int monthNum = scan.nextInt();
        String monthName = monthSwitch(monthNum);
        System.out.println("Month "+monthNum+" is: "+monthName);
    }

    // method to check month of the year
    public static String monthSwitch(int num){
       return switch (num){
            case 1  -> "January";
            case 2  -> "February";
            case 3  -> "March" ;
            case 4  -> "April";
            case 5  -> "May";
            case 6  -> "June";
            case 7  -> "July";
            case 8  -> "August";
            case 9  -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Doesn't exist";
        };
    }
}
