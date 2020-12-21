package by.epam.learn.main.modul3.simpleClasess;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class AirLine {
    private final String flyingTo;
    private final String flightNumber;
    private final String aircraft;
    private final Date departure;
    private final DayOfWeek[] dayOfWeek;
    static SimpleDateFormat ft = new SimpleDateFormat("HH:mm");

    public AirLine(String flyingTo, String flightNumber, String aircraft, Date departure, DayOfWeek[] dayOfWeek) {
        this.flyingTo = flyingTo;
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.departure = departure;
        this.dayOfWeek = dayOfWeek;
    }

    public String getFlyingTo() {
        return flyingTo;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAircraft() {
        return aircraft;
    }

    public Date getDeparture() {
        return departure;
    }

    public DayOfWeek[] getDayOfWeek() {
        return dayOfWeek;
    }

    @Override
    public String toString() {
        return String.format("%-25s %-16s %-22s %-13s %-10s",
                flyingTo, flightNumber, aircraft, ft.format(departure), Arrays.toString(dayOfWeek));
    }
}
