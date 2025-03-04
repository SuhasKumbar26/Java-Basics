package Executor.MultiThreadExecutor;

public class WorkBuilder implements Runnable{

    @Override
    public void run() {
        int randomTimeSleep = (int) (Math.round(Math.random()*5000));
        System.out.println("Sleep Time: "+randomTimeSleep);

        try {
            Thread.sleep(randomTimeSleep);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%02d ",i);
            System.out.printf("Thread name: %s and Sleeping time is: %d\n",
                    Thread.currentThread().getName(),randomTimeSleep);
        }
    }
}
