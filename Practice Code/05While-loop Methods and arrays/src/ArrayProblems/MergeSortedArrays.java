package ArrayProblems;

public class MergeSortedArrays {
    public static void main(String[] args){
        System.out.println("Welcome to Merging two sorted arrays: ");
        int[] array1 = ArrayUtility.inputElements();
        int[] array2 = ArrayUtility.inputElements();

        int[] newArray = mergeSortedArrays(array1,array2);
        ArrayUtility.displayElements(newArray);
    }
    //Merging

    public static int[] mergeSortedArrays(int[] arr1,int[] arr2){
        int newArrSize = arr1.length+arr2.length;
        int[] newArray = new int[newArrSize];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length || j < arr2.length){
            if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])){
                newArray[k] = arr1[i];
                i++;
                k++;
            } else {
                newArray[k] = arr2[j];
                k++;
                j++;
            }
        }
        return newArray;
    }
}
