package ArrayProblems;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = ArrayUtility.inputElements();
        ArrayUtility.displayElements(array);
        int[] newArray = reverseArray(array);
        ArrayUtility.displayElements(newArray);
    }

    // Reverse an Array
    public static int[] reverseArray(int[] arr){
        int i = 0;
        while (i < arr.length/2){
            int temp = arr[i];
            arr[i] = arr[(arr.length-1)-i];
            arr[(arr.length-1)-i] = temp;
            i++;
        }
        return arr;
    }
}
