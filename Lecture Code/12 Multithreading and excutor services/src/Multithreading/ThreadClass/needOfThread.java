package Multithreading.ThreadClass;

public class needOfThread {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        //First task
        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.printf("\n %s: * task is Completed"
                ,Thread.currentThread().getName());

        //Second task
        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%d$ ",i);
        }
        System.out.printf("\n %s: $ task is Completed"
                ,Thread.currentThread().getName());

        //Third task
        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%d# ",i);
        }
        System.out.printf("\n %s: # task is Completed"
                ,Thread.currentThread().getName());

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken by Machine is: "+(endTime-startTime));
    }
}
