public class Methods {
    //Block of reusable code. Don't repeat Yourself(DRY)

    public static void main(String[] args){
//      System.out.print("Good morning Developers");
        System.out.println("Before Function Calling(invoke)");
        greetingUser();
        System.out.println("After Function Calling(invoke)");
        leftPyramid();
        reverseLeftPyramid();

    }

    public static void greetingUser(){
        System.out.println("Good Morning Developers................");
    }

    public static void leftPyramid(){
        /* System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");
        System.out.println("\n"); */

        int rows = 0;
        while (rows < 5){
            System.out.print("*");
            int i = 0;
            while(i < rows ){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
        System.out.println();
    }

    public static void reverseLeftPyramid(){
        /* System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
        System.out.println("\n"); */

        int rows = 0;
        while(rows < 5){
            System.out.print("*");
            int j = 5;
            while(rows<j-1){
                System.out.print(" *");
                j--;
            }
            System.out.println();
            rows++;
        }
        System.out.println();
    }
}
