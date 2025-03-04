package MultiThreading.ThreeThread;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        printThread t1 = new printThread(1);
        printThread t2 = new printThread(2);
        printThread t3 = new printThread(3);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();
    }
}
