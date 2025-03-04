package MultiThreading.ThreadState;

import MultiThreading.HelloThread.ThreadCreation;

public class stateOfThread {
    public static void main(String[] args) throws InterruptedException {
        ThreadCreation t1 = new ThreadCreation(1);
        System.out.printf("%s\n",t1.getState());

        t1.start();
        System.out.printf("%s\n",t1.getState());

        Thread.sleep(1000);

        t1.join();
        System.out.printf("%s\n",t1.getState());
    }
}
