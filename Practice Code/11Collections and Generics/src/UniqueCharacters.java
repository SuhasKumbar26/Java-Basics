import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Character> unique = new HashSet<>();

        System.out.print("Enter String: ");
        String str = scan.nextLine();

        for (char c :str.toCharArray()){
            unique.add(c);
        }

        System.out.println(unique);
        System.out.printf("Your string has %d unique characters",unique.size());
    }
}
