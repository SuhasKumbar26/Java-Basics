package Executor.SingleThreadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestNum {
    public static void main(String[] args) {

        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            NumPrint task1 = new NumPrint('$');
            service.submit(task1);

            NumPrint task2 = new NumPrint('!');
            service.submit(task2);

            service.shutdown();
        }
    }
}
