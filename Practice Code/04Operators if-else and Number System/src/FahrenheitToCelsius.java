import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter fahrenheit: ");
        float fahrenheit = input.nextFloat();
        float celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Fahrenheit in celsius is: "+ celsius);
    }
}
