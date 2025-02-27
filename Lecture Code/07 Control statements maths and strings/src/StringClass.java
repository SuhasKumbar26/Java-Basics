public class StringClass {
    public static void main(String[] args) {
        System.out.println("Welcome to String class");

        // Both are stored in StringPool(HEAP) memory.
        String str1 = "Java";
        String str2 = "Java";

        // both address are compared & have common address.
        System.out.println("Str1 == Str2: "+ (str1 == str2));

        // This string is stored in Exactly on HEAP memory
        String newStr = new String("Java");

        // Gives false because both are stored in different places.
        System.out.println("Str1 == newStr: "+(str1 == newStr));

        // .equals()
        System.out.println("Str1 == newStr comparison using .equals: "+( newStr.equals(str1) ) );
    }
}
