package MultiThreading.TrafficThread;

public class road {
    public static void main(String[] args) throws InterruptedException {
        trafficSignalThread red = new trafficSignalThread(TrafficColor.RED);
        trafficSignalThread yellow = new trafficSignalThread(TrafficColor.YELLOW);
        trafficSignalThread green = new trafficSignalThread(TrafficColor.GREEN);

        green.start();
        green.join();

        yellow.start();
        yellow.join();

        red.start();
        red.join();
    }
}
