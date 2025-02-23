import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();

        if(year % 4 == 0 && year % 100 != 0){
            System.out.print("LEAP Year");
        } else if ( year % 400 == 0) {
            System.out.println("LEAP Year");
        } else System.out.println("Not a Leap year");
    }
}
