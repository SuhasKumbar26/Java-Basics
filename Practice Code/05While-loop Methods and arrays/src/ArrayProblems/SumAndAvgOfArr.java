package ArrayProblems;

public class SumAndAvgOfArr {
    public static void main(String[] args){
        System.out.println("welcome to Sum and Average of array elements");

/*      Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of elements: ");
        int size = scan.nextInt();
        int[] numberArray = new int[size];

        int i = 0;
        while (i < numberArray.length){
            System.out.print("index ["+i+"]: ");
            numberArray[i] = scan.nextInt();
            i++;
        }

        int j = 0;
        System.out.println("Displaying Array Elements");
        while (j < numberArray.length){
            System.out.println("index ["+ j +"]: "+numberArray[j]);
            j++;
        }
*/
        int[] arr = ArrayUtility.inputElements();
        ArrayUtility.displayElements(arr);
        sumAndAvg(arr);
    }

    //method to Sum and Avg
    public static void sumAndAvg(int[] arr){
        float sum = 0 ,avg = 0;
        int i = 0;
        while(i < arr.length){
            sum += arr[i];
            i++;
        }
        avg = sum / arr.length;
        System.out.println("Sum of array elements is: "+sum);
        System.out.println("Average of array elements is: "+avg);
    }
}
