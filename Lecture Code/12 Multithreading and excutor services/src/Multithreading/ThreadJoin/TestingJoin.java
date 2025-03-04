package Multithreading.ThreadJoin;

import Multithreading.Runnable.printTask;

public class TestingJoin {
    public static void main(String[] args) throws InterruptedException {
        printTask p1 = new printTask('@');
        printTask p2 = new printTask('#');
        printTask p3 = new printTask('!');

        Thread t1 = new Thread(p1);
        System.out.println("Thread 1 started");
        t1.start();

        Thread t2 = new Thread(p2);
        System.out.println("Thread 2 started");
        t2.start();

        t1.join(); //main thread waits for t1 to complete task and join.

        Thread t3 = new Thread(p3);
        System.out.println("Thread 3 started");
        t3.start();
    }
}
