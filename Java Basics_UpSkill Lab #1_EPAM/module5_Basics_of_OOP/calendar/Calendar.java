package by.epam.learn.main.modul5.calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class Calendar {
    private final int year;
    private final TreeSet<Holiday> holidays;

    public Calendar(int year) {
        this.year = year;
        this.holidays = new TreeSet<>(Comparator.comparing(Holiday::getHolidayDay));
    }

    public void addHoliday(LocalDate holidayDay, String nameHoliday) {
        holidays.add(new Holiday(holidayDay, nameHoliday));
    }

    public TreeSet<Holiday> addWeekend(int year) {
        LocalDate start = LocalDate.of(year, 1, 1);
        for (LocalDate date = start; date.isBefore(start.plusYears(1)); date = date.plusDays(1)) {
            if (date.getDayOfWeek() == (DayOfWeek.SATURDAY)) {
                holidays.add(new Holiday(date, "Saturday"));
            }
            if (date.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                holidays.add(new Holiday(date, "Sunday"));
            }
        }
        return holidays;
    }

    @Override
    public String toString() {
        return getYear() + getHolidays().toString();
    }

    public int getYear() {
        return year;
    }

    public TreeSet<Holiday> getHolidays() {
        return holidays;
    }

    static class Holiday {
        private final LocalDate holidayDay;
        private final String nameHoliday;

        public Holiday(LocalDate holidayDay, String nameHoliday) {
            this.holidayDay = holidayDay;
            this.nameHoliday = nameHoliday;
        }

        public LocalDate getHolidayDay() {
            return holidayDay;
        }

        public String getNameHoliday() {
            return nameHoliday;
        }

        @Override
        public String toString() {
            return "\n" + getHolidayDay() + "\t" + getNameHoliday();
        }
    }
}
