package Multithreading.ThreadClass;

public class SecondTask extends Thread {
    @Override
    public void run() {
        //Second task
        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%d$ ",i);
        }
        System.out.printf("\n %s: $ task is Completed"
                ,Thread.currentThread().getName());
    }
}
