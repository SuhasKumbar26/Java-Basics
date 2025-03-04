package MultiThreading.TrafficThread;

public enum TrafficColor {
    RED(6000),
    GREEN(4000),
    YELLOW(3000);

    private final int onTimeInMillis;

    TrafficColor(int onTimeInMillis) {
        this.onTimeInMillis = onTimeInMillis;
    }

    public int getOnTimeInMillis() {
        return onTimeInMillis;
    }
}
