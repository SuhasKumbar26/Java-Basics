import java.util.Scanner;

public class ModernSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter day: ");
        int dayNum = scan.nextInt();

        String dayName = switch (dayNum){
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid";
        };

        System.out.println("Aaj "+dayName+" hai");
    }
}
