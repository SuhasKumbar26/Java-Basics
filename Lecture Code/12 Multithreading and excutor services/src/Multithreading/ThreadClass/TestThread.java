package Multithreading.ThreadClass;

public class TestThread {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        //First Task
        FirstTask t1 = new FirstTask();

        //Second Task
        SecondTask t2 = new SecondTask();

        //Third Task
        ThirdTask t3 = new ThirdTask();

        System.out.println("Starting Thread 1");
        t1.start();
        System.out.println("Starting Thread 2");
        t2.start();
        System.out.println("Starting Thread 3");
        t3.start();

        long endTime = System.currentTimeMillis();

        System.out.println("\nTime taken by Machine is: "+(endTime-startTime));
    }
}
