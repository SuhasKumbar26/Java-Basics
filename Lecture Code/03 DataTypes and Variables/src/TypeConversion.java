public class TypeConversion {
    public static void main(String[] args){
        System.out.println("Type conversion");
        //implicit Type conversion
        float iFloat = 123;
        System.out.println(iFloat);
        double iDouble = 12;
        System.out.println(iDouble);
        double iNum = 12.568f;
        System.out.println(iNum);

        //explicit Type conversion
        int eInt = (int) 12.345;
        System.out.println(eInt);
        long number = (long) 123.36;
        System.out.println(number);
        float eFloat = (float) 23.456;
        System.out.println(eFloat);

    }
}
