package Futures;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingFutures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        FetchName task1 = new FetchName("San chit");
        FetchName task2 = new FetchName("Subscribe");
        FetchName task3 = new FetchName("Boomi");
        FetchName task4 = new FetchName("Java developer");

        Future<String> name1 = service.submit(task1);
        Future<String> name2 = service.submit(task2);
        Future<String> name3 = service.submit(task3);
        Future<String> name4 = service.submit(task4);

        System.out.println("\nName: "+name1.get());
        System.out.println("\nName: "+name2.get());
        System.out.println("\nName: "+name3.get());
        System.out.println("\nName: "+name4.get());

        service.shutdown();
    }
}
