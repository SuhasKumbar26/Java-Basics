public class ArgumentsParameters {
    public static void main(String[] args){

        int sum = sumTwoNumber(23 ,17); //Actual number passing called " Arguments"
        System.out.println("Sum is: "+sum);

        int sum1 = sumTwoNumber(40 ,-20);
        System.out.println("Sum is: "+ sum1);
    }

    public static int sumTwoNumber(int firstNum, int secondNum){ // parameters
        System.out.println("First number received: "+ firstNum);
        System.out.println("Second number received: "+ secondNum);
        int sum = firstNum + secondNum;
        return sum;
    }
}
