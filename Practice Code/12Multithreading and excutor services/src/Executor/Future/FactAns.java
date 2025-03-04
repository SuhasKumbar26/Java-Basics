package Executor.Future;

import java.util.concurrent.Callable;

public class FactAns implements Callable<Integer> {
    private final int number;

    FactAns(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(5000);
        int ans = 1;
        for (int i = 1; i <= number; i++) {
            ans *= i;
        }
        return ans;
    }
}
