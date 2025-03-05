package Lambda;

public class testingLambda {

    public static void main(String[] args) {
        System.out.println("Hello world");

        testingLambda test = new testingLambda();
        int sum = test.sum(23,17);

        test.printString("Hello String..!");

        // toPrint -> System.out.println(toPrint);
        // (a, b) -> a + b;
        /* (a, b) -> {
            int sum = a+ b;
            System.out.println();
          } */
    }


    public void printString(String toString){
        System.out.println(toString);
    }

    public int sum(int a, int b){
        return a+b;
    }

}
