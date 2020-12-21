package by.epam.learn.main.modul3.simpleClasess;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    static String airportName = "Warsaw Chopin Airport";
    static Departures airport = new Departures(airportName, new ArrayList<>());
    static DayOfWeek day = DayOfWeek.FRIDAY;

    public static void main(String[] args) throws ParseException {
        airport.addTable("Amsterdam (AMS)", "LO 265", "Embraer 190",
                AirLine.ft.parse("07:20"), new DayOfWeek[]{DayOfWeek.EVERYDAY});
        airport.addTable("Zurich (ZRH)", "LX 1353", "Airbus A220-300", AirLine.ft.parse
                ("13:25"), new DayOfWeek[]{DayOfWeek.THURSDAY, DayOfWeek.TUESDAY, DayOfWeek.SATURDAY});
        airport.addTable("Zagreb (ZAG)", "LO 613", "Embraer 170", AirLine.ft.parse
                ("15:40"), new DayOfWeek[]{DayOfWeek.FRIDAY, DayOfWeek.WEDNESDAY});
        airport.addTable("Paris (CDG)", "LO 331", "Embraer 190",
                AirLine.ft.parse("07:35"), new DayOfWeek[]{DayOfWeek.EVERYDAY});
        airport.addTable("Santa Clara (SNU)", "BV 6246", "Boeing 777-200 ",
                AirLine.ft.parse("09:10"), new DayOfWeek[]{DayOfWeek.FRIDAY});
        airport.addTable("Tbilisi (TBS)", "LO 7257", "Embraer 190",
                AirLine.ft.parse("21:45"), new DayOfWeek[]{DayOfWeek.WEDNESDAY});
        airport.addTable("Paris (CDG)", "AF 1047", "Airbus A319",
                AirLine.ft.parse("17:20"), new DayOfWeek[]{DayOfWeek.EVERYDAY});

        findFlyingTo();
        findByDay();
        findByDayAndTime();
    }

    private static void printResult(ArrayList<AirLine> flights) {
        System.out.println("available flights from \"" + airportName + "\":");
        System.out.printf("%11s%25s%17s%19s%21s\n",
                "flyingTo", "flightNumber", "aircraft", "checkIn", "dayOfWeek");
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
        Date time = AirLine.ft.parse("15:00");
        ArrayList<AirLine> flights = airport.sortByDayAndTime(day, time);
        System.out.print("\n" + day.toString() + " after " + AirLine.ft.format(time) + " ");
        printResult(flights);
    }
}

