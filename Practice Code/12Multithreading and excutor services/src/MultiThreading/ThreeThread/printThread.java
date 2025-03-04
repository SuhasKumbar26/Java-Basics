package MultiThreading.ThreeThread;

public class printThread extends Thread {
    private final int ThreadNo;

    printThread(int ThreadNo){
        this.ThreadNo = ThreadNo;
    }

    @Override
    public void run() {
        System.out.printf("%s Thread is Starting-%d\n",getName(),ThreadNo);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("%s Thread is Ended-%d\n",getName(),ThreadNo);
    }
}
