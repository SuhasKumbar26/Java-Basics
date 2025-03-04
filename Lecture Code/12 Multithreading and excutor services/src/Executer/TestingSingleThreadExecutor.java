package Executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingSingleThreadExecutor {

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        printTask task1 = new printTask('#');
        printTask task2 = new printTask('$');
        printTask task3 = new printTask('%');

        service.submit(task1);
        service.submit(task2);
        service.submit(task3);

        service.shutdown();


    }
}
