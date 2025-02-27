package ForEachLoop;
import ArrayProblems.ArrayUtility;

public class MaximumValueInArray {
    public static void main(String[] args){
        int[] numArr = ArrayUtility.inputElements();
        int maxInArr = maximumInArray(numArr);
        System.out.println("Maximum value is: "+maxInArr);

    }

    // method to check max value in array using For each loop
    public static int maximumInArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int n: arr){
            if (n > max){
                max = n;
            }
        }
        return max;
    }
}
