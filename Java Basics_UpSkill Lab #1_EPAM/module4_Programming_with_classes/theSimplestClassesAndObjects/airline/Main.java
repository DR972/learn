package by.epam.learn.main.modul3.simpleClasess;

/**
 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
 * toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    static String airportName = "Warsaw Chopin Airport";
    static Departures airport = new Departures(airportName, new ArrayList<>());
    static DayOfWeek day = DayOfWeek.FRIDAY;

    public static void main(String[] args) throws ParseException {
        airport.addTable("Amsterdam (AMS)", "LO 265", "Embraer 190",
                AirLine.DATE_FORMAT.parse("07:20"), new DayOfWeek[]{DayOfWeek.EVERYDAY});
        airport.addTable("Zurich (ZRH)", "LX 1353", "Airbus A220-300",
                AirLine.DATE_FORMAT.parse("13:25"), new DayOfWeek[]{DayOfWeek.THURSDAY,
                        DayOfWeek.TUESDAY, DayOfWeek.SATURDAY});
        airport.addTable("Zagreb (ZAG)", "LO 613", "Embraer 170",
                AirLine.DATE_FORMAT.parse("15:40"),
                new DayOfWeek[]{DayOfWeek.FRIDAY, DayOfWeek.WEDNESDAY});
        airport.addTable("Paris (CDG)", "LO 331", "Embraer 190",
                AirLine.DATE_FORMAT.parse("07:35"), new DayOfWeek[]{DayOfWeek.EVERYDAY});
        airport.addTable("Santa Clara (SNU)", "BV 6246", "Boeing 777-200 ",
                AirLine.DATE_FORMAT.parse("09:10"), new DayOfWeek[]{DayOfWeek.FRIDAY});
        airport.addTable("Tbilisi (TBS)", "LO 7257", "Embraer 190",
                AirLine.DATE_FORMAT.parse("21:45"), new DayOfWeek[]{DayOfWeek.WEDNESDAY});
        airport.addTable("Paris (CDG)", "AF 1047", "Airbus A319",
                AirLine.DATE_FORMAT.parse("17:20"), new DayOfWeek[]{DayOfWeek.EVERYDAY});

        findFlyingTo();
        findByDay();
        findByDayAndTime();
    }

    private static void printResult(ArrayList<AirLine> flights) {
        System.out.println("available flights from \"" + airportName + "\":");
        System.out.printf("%11s%25s%17s%20s%19s\n",
                "flyingTo", "flightNumber", "aircraft", "departure", "dayOfWeek");
        System.out.println("-----------------------------------------------------------------" +
                "------------------------------------------");
        if (flights.size() == 0) {
            System.out.println("Flights not found.");
        } else {
            for (AirLine airLine : flights) {
                System.out.println(airLine);
            }
        }
        System.out.println("------------------------------------------------------------------" +
                "------------------------------------------");
    }

    private static void findFlyingTo() {
        String flyingTo = "Paris (CDG)";
        ArrayList<AirLine> flights = airport.sortFlyingTo(flyingTo);
        System.out.print("\nTo " + flyingTo + " ");
        printResult(flights);
    }

    private static void findByDay() {
        ArrayList<AirLine> flights = airport.sortByDay(day);
        System.out.print("\n" + day.toString() + " ");
        printResult(flights);
    }

    private static void findByDayAndTime() throws ParseException {
        Date time = AirLine.DATE_FORMAT.parse("15:00");
        ArrayList<AirLine> flights = airport.sortByDayAndTime(day, time);
        System.out.print("\n" + day.toString() + " after " + AirLine.DATE_FORMAT.format(time) + " ");
        printResult(flights);
    }
}

