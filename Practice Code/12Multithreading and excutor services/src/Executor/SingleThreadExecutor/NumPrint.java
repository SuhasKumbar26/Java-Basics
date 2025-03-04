package Executor.SingleThreadExecutor;

public class NumPrint implements Runnable{
    private final char symbol;

    public NumPrint(char symbol){
        this.symbol = symbol;
    }

    public char getSymbol(){
        return symbol;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%02d%c \n",i,symbol);
        }
    }
}
