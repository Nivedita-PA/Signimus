package com.Nivedita.Task18;

public enum Days {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    public String isWeekendOrWeekday(){
        if(this==SATURDAY || this==SUNDAY) return "WEEKEND";
        return "WEEKDAY";
    }

    public static void main(String[] args) {
        System.out.println(Days.SATURDAY.isWeekendOrWeekday());
        System.out.println(Days.MONDAY.isWeekendOrWeekday());
    }
}
