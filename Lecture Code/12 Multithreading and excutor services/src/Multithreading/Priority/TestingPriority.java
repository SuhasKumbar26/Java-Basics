package Multithreading.Priority;

import Multithreading.Runnable.printTask;

public class TestingPriority {
    public static void main(String[] args) {
        printTask p1 = new printTask('@');
        printTask p2 = new printTask('#');
        printTask p3 = new printTask('!');

        Thread t1 = new Thread(p1);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();

        Thread t2 = new Thread(p2);
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.start();

        Thread t3 = new Thread(p3);
        t1.setPriority(Thread.MAX_PRIORITY);
        t3.start();
    }
}
