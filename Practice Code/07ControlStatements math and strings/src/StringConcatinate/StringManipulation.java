package StringConcatinate;

public class StringManipulation {
    public static void main(String[] args) {
        String firstName = "Java";
        String lastName = "Developer";

        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);
        System.out.println(fullName.toUpperCase());
    }
}
