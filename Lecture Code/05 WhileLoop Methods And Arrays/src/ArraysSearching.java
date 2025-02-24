import java.util.Scanner;

public class ArraysSearching {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] myArray = {23,41,65,90,87};
        System.out.print("Enter number to search in Array: ");
        int element = scan.nextInt();
        boolean isFound = isFound(myArray,element);
        if (isFound){
            System.out.println("Yes it's found");
        } else System.out.println("Nope sorry...");
    }

    //Method for searching in Array

    public static boolean isFound(int[] arr, int num){
        int index = 0;
        while (index < arr.length){
            if (arr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }
}
