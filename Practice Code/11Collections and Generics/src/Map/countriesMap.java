package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countriesMap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String,String> countries = new HashMap<>();
        countries.put("India","New delhi");
        countries.put("America","Washington D.C");
        countries.put("Japan","Tokyo");
        countries.put("England","Landon");
        countries.put("Russia","Moscow");

        System.out.print("Enter country name: ");
        String countryName = scan.nextLine();

        if (countries.containsKey(countryName)){
            System.out.printf("Capital of %s is: %s \n",countryName,countries.get(countryName));
        } else System.out.println("Sorry we don't know...!");
    }

}
