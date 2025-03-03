package src.Enums;

public class testingEnum {
    public static void main(String[] args) {

        //Traffic light enum
        TrafficLight color1 = TrafficLight.GREEN;
        TrafficLight color2 = TrafficLight.RED;
        TrafficLight color3 = TrafficLight.YELLOW;
        System.out.println(color3);
        System.out.println(color1);
        System.out.println(color2);

        //Grade enum
        Grade grade = Grade.A;
        System.out.println(grade);

        //ValueOf()
        Grade grade1 = Grade.valueOf("D");
        System.out.println(grade1);

        //iterating over enum using Values()
        for (Grade value : Grade.values()) {
            System.out.println(" "+value);
        }
    }
}
