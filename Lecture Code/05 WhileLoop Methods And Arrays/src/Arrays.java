import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5]; // Initialization
        array[0]=23;
        array[1]=17;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        int[] intValues = {1,2,3,4,5}; // Declaration
        int i = 0;
        System.out.print("IntValues: ");
        while (i < intValues.length){
            System.out.print(intValues[i]+" ");
            i++;
        }

        String[] name = new String[2];
        name[0] = "Suhas Kumbar";
        System.out.println("\nName: "+name[0]);

        String[] fruits = {"Banana","Apple","Cherry","Watermelon"};
        System.out.print("Fruits: ");
        int j = 0;
        while (j < fruits.length){
            System.out.print(fruits[j]+" ");
            j++;
        }
    }
}
