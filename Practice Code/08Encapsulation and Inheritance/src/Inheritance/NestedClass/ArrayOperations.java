package Inheritance.NestedClass;

public class ArrayOperations {

    private int[] arrNum;

    ArrayOperations(int[] arr){
        this.arrNum = arr;
    }

    protected class Statistics{

        double mean(){
            double sum = 0;
            for (int i : arrNum) {
                sum+=i;
            }
            return sum / arrNum.length;
        }

        double median(){
            return 0;
        }

    }
}
