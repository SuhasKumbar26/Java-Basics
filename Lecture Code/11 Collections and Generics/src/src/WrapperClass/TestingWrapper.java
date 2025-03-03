package src.WrapperClass;

public class TestingWrapper {
    public static void main(String[] args) {
        //'Integer(int)' is deprecated since version 9 and marked for removal
//       Integer num0 = new Integer(55);

        Integer num0 = Integer.valueOf(55);
        Integer num1 = 103;
        Double d = 123.45;
        Float f = null;

        System.out.println(num0);
        System.out.println(num1);
        System.out.println(d);
        System.out.println(f);

        //AutoBoxing: Automatic conversion of primitive to Wrapper class object
        Integer num2 = 101;
        Double d2 = 23.54;
        System.out.println(num2);
        System.out.println(d2);

        //UnBoxing: Automatic conversion of Wrapper class object to Primitive
        int number = num2;
        System.out.println(number);

    }
}
