package Enum;

import java.util.Arrays;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.SUNDAY);
        today.daysInfo();
        System.out.println(today.weekDay);

        WeekDays w1 = WeekDays.FRIDAY;
        WeekDays w2 = WeekDays.FRIDAY;
        WeekDays w3 = WeekDays.FRIDAY;
        System.out.println(w1==w2);
        System.out.println(w1==w3);
        System.out.println(WeekDays.FRIDAY.equals(WeekDays2.FRIDAY));

        WeekDays w15 = WeekDays.valueOf("MONDAY");
        System.out.println(w15);

        WeekDays [] array = WeekDays.values();
        System.out.println(Arrays.toString(array));
    }
}

enum WeekDays{
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY,
    SATURDAY("great"),
    SUNDAY("great");

    private String mood;

    private WeekDays(String mood) {
        this.mood = mood;
    }

    private WeekDays() {
    }

    public String getMood() {
        return mood;
    }
}

enum WeekDays2{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}


class Today {
    WeekDays weekDay;
    public Today (WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Go to work!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("You can sleep!");
        }
        System.out.println("Настроение в этот день: " + weekDay.getMood());
    }
}
