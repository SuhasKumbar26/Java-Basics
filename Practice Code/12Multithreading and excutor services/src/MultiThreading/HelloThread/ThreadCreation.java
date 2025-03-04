package MultiThreading.HelloThread;

public class ThreadCreation extends Thread{
    private final int tNo;

    public ThreadCreation(int tNo){
        this.tNo = tNo;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Hello from Thread %d : %d\n",tNo,i);
        }
    }

    public int getTno() {
        return tNo;
    }
}
