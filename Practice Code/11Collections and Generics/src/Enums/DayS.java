package Enums;

public enum DayS {

    SUNDAY(false),
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(true);

    private boolean isWeekDay;

    DayS(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }

    public String getType(){
        return isWeekDay? "WeekDay" : "WeekEND";
    }
}
