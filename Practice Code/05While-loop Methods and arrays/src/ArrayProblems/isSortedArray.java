package ArrayProblems;

public class isSortedArray {
    public static void main(String[] args) {
        System.out.println("Checking Array is sorted or not");
        int[] array = ArrayUtility.inputElements();
        ArrayUtility.displayElements(array);
        boolean isInc = isIncreasing(array);
        boolean isDec = isDecreasing(array);
        if (isDec || isInc){
            System.out.println("\nYes it's SORTED");
        } else System.out.println("\nNo not at all...");

    }
    //Increasing method
    public static boolean isIncreasing(int[] arr){
        int i = 1;
        while (i < arr.length){
            if (arr[i-1] > arr[i]){
                return false;
            }
            i++;
        }
        return true;
    }

    //Decreasing method
    public static boolean isDecreasing(int[] arr){
        int j = 1;
        while (j < arr.length){
            if (arr[j] > arr[j-1]){
                return false;
            }
            j++;
        }
        return true;
    }
}
