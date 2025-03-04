package Multithreading.ThreadCommunication;

public class Sleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Before sleeping");
        Thread.sleep(1000);
        System.out.println("Woke up");
    }
}
