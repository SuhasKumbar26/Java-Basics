package src.Enums;

public enum TrafficLight {
    RED("Stop"), GREEN("Go"), YELLOW("Ready");

    private final String action;

    TrafficLight(String action){
        this.action=action;
    }
}
