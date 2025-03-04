package Futures;

import java.util.concurrent.Callable;

public class FetchName implements Callable<String> {

    private final String name;

    public FetchName(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.printf("\nGetting name from server");
        Thread.sleep(4000);
        return this.name+" Hello";
    }
}
