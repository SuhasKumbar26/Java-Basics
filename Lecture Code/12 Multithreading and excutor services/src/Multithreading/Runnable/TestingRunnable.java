package Multithreading.Runnable;

public class TestingRunnable {
    public static void main(String[] args) {
        printTask p1 = new printTask('@');
        printTask p2 = new printTask('#');
        printTask p3 = new printTask('!');

        Thread t1 = new Thread(p1);
        t1.start();

        Thread t2 = new Thread(p2);
        t2.start();

        Thread t3 = new Thread(p3);
        t3.start();
    }
}
