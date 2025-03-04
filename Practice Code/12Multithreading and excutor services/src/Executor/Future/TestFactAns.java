package Executor.Future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestFactAns {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        try(ExecutorService service = Executors.newFixedThreadPool(3)){
            List <Future<Integer>> list = new ArrayList<>();

            for (int i = 1; i <= 10; i++) {
                FactAns task = new FactAns(i);
                list.add(service.submit(task));
            }

            for (Future<Integer> future : list) {
                System.out.printf("Result is: %07d\n",future.get());
            }

            service.shutdown();

            if (!service.awaitTermination(5, TimeUnit.SECONDS)){
                service.shutdownNow();
                System.out.println("EMERGENCY SHUTDOWN");
            }
        }



//        FactAns task1 = new FactAns(5);
//        Future<Double> task1Ans = service.submit(task1);
//        System.out.println("Ans of task1 is: "+task1Ans.get());
//
//        FactAns task2 = new FactAns(6);
//        Future<Double> task2Ans = service.submit(task2);
//        System.out.println("Ans of task2 is: "+ task2Ans.get());
//
//        FactAns task3 = new FactAns(8);
//        Future<Double> task3Ans = service.submit(task3);
//        System.out.println("Ans of task3 is: "+ task3Ans.get());
//

    }
}
