package Executor.MultiThreadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestMultiThread {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service  = Executors.newFixedThreadPool(3);

        WorkBuilder work1 = new WorkBuilder();
        service.submit(work1);
        System.out.println();

        WorkBuilder work2 = new WorkBuilder();
        service.submit(work2);
        System.out.println();

        WorkBuilder work3 = new WorkBuilder();
        service.submit(work3);
        System.out.println();

        service.shutdown();

        if (!service.awaitTermination(5, TimeUnit.SECONDS)){
            service.shutdownNow();
            System.out.println("EMERGENCY SHUTDOWN");
        }
    }
}
