package MultiThreading.HelloThread;

public class Test {
    public static void main(String[] args) {
        ThreadCreation t1 = new ThreadCreation(1);
        ThreadCreation t2 = new ThreadCreation(2);

        t1.start();
        t2.start();
//        t2.run(); runs on main thread not creates new Thread
    }
}
