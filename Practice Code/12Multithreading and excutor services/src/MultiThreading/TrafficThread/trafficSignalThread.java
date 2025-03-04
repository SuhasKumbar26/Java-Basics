package MultiThreading.TrafficThread;

public class trafficSignalThread extends Thread {

    private final TrafficColor color;

    public trafficSignalThread(TrafficColor color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("%s active\n",color);

        try {
            Thread.sleep(color.getOnTimeInMillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("%s Inactive\n",color);
    }
}
