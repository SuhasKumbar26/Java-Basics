package Enums;

public class TestingDays {
    public static void main(String[] args) {
        DayS day1 = DayS.SUNDAY;
        System.out.print(day1);
        System.out.println(": "+day1.getType());
        System.out.println("-----------------");

        for (DayS day : DayS.values()) {
            System.out.printf("%s : %s\n",day,day.getType());
        }
    }
}
