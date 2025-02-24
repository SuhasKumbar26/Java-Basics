import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = 1;                    //initialization
        while (num<=10){                //condition
            System.out.print(num+" ");  //actual work
            num++;                      //update
            //num = num + 1;
        }

        System.out.println("\n");

        int count = 50; //initialization
        while(count >20){ //condition
            System.out.print(count+" ");
            count--; // update
            //count = count - 1;
        }

        System.out.println("\n");

        int i = 0;//initialization
        while (i<5){ // condition
            System.out.print("Enter "+(i+1)+" number: ");
            int inp = scanner.nextInt();
            System.out.println("Ur number is: "+inp);
            i++; // update
        }
    }
}
