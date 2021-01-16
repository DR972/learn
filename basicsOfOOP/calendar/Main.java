package by.epam.learn.main.modul5.calendar;

import java.time.LocalDate;

/**
 * Создать класс Календарь с внутренним классом, с помощью объектов которого
 * можно хранить информацию о выходных и праздничных днях.
 */

public class Main {

    public static void main(String[] args) {
        int year = 2021;
        Calendar calendar = new Calendar(year);
        calendar.addHoliday(LocalDate.of(year, 1, 1), "New Year");
        calendar.addHoliday(LocalDate.of(year, 1, 2), "New Year");
        calendar.addHoliday(LocalDate.of(year, 1, 7), "Orthodox Christmas");
        calendar.addHoliday(LocalDate.of(year, 3, 8), "Women’s Day");
        calendar.addHoliday(LocalDate.of(year, 5, 1), "Labour Day");
        calendar.addHoliday(LocalDate.of(year, 5, 9), "Victory Day");
        calendar.addHoliday(LocalDate.of(year, 7, 3), "Independence Day");
        calendar.addHoliday(LocalDate.of(year, 11, 7), "October Revolution Day");
        calendar.addHoliday(LocalDate.of(year, 12, 25), "Catholic Christmas");

        System.out.println("Выходные и праздничные дни " + year + " года " + calendar.addWeekend(year));
    }
}
