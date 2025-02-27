public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("Before Loop");

        //BREAK
        for (int i = 0;i < 10; i++){
            if (i == 5){
                break; // 0 1 2 3 4
            }
            System.out.print(i+" ");
        }

        System.out.println();

        //CONTINUE
        for (int j = 0; j < 10; j++){
            if (j == 5){
                continue; // 0 1 2 3 4  6 7 8 9
            }
            System.out.print(j +" ");
        }

        System.out.println("\nOut of loop");
    }
}
