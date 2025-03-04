package Multithreading.Runnable;

public class printTask implements Runnable {

    private final char targetChar;

    public printTask(char targetChar) {
        this.targetChar = targetChar;
    }


    @Override
    public void run() {
        //First task
        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%d%c ",i,targetChar);
        }
        System.out.printf("\n %s: %c task is Completed"
                ,Thread.currentThread().getName(),targetChar);
    }
}
