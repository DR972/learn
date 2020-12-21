package by.epam.learn.main.modul3.simpleClasess;

import java.util.ArrayList;
import java.util.Date;

public class Departures {
    private String airportName;
    ArrayList<AirLine> flights;

    public Departures(String airportName, ArrayList<AirLine> flights) {
        this.airportName = airportName;
        this.flights = flights;
    }

    void addTable(String flyingTo, String flightNumber, String aircraft, Date departure, DayOfWeek[] dayOfWeek) {
        flights.add(new AirLine(flyingTo, flightNumber, aircraft, departure, dayOfWeek));
    }

    ArrayList<AirLine> sortFlyingTo(String flyingTo) {
        ArrayList<AirLine> flights = new ArrayList<>();
        for (AirLine airLine : this.flights) {
            if (airLine.getFlyingTo().compareToIgnoreCase(flyingTo) == 0) {
                flights.add(airLine);
            }
        }
        return flights;
    }

    ArrayList<AirLine> sortByDay(DayOfWeek dayOfWeek) {
        ArrayList<AirLine> flights = new ArrayList<>();
        for (AirLine airline : this.flights) {
            for (DayOfWeek day : airline.getDayOfWeek()) {
                if (day == dayOfWeek || day == DayOfWeek.EVERYDAY) {
                    flights.add(airline);
                    break;
                }
            }
        }
        return flights;
    }

    ArrayList<AirLine> sortByDayAndTime(DayOfWeek dayOfWeek, Date departure) {
        ArrayList<AirLine> flights = new ArrayList<>();
        for (AirLine airLine: sortByDay(dayOfWeek)) {
                if (airLine.getDeparture().compareTo(departure)>=0) {
                    flights.add(airLine);
                }
        }
        return flights;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public ArrayList<AirLine> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<AirLine> flights) {
        this.flights = flights;
    }
}
