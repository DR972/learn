package by.epam.learn.main.modul3.simpleClasess;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StationScoreboard {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat ft = new SimpleDateFormat("HH:mm");
        Train[] trains = new Train[7];
        trains[0] = new Train("Edinburgh", 1, new Date[]{ft.parse("6:05"),
                ft.parse("16:15")});
        trains[1] = new Train("Cardiff", 5, new Date[]{ft.parse("6:20"),
                ft.parse("10:15"), ft.parse("14:10"), ft.parse("18:05"),
                ft.parse("22:00")});
        trains[2] = new Train("Edinburgh", 3, new Date[]{ft.parse("10:25"),
                ft.parse("20:50")});
        trains[3] = new Train("Glasgow", 10, new Date[]{ft.parse("6:50"),
                ft.parse("17:05")});
        trains[4] = new Train("Glasgow", 12, new Date[]{ft.parse("11:00"),
                ft.parse("21:45")});
        trains[5] = new Train("Liverpool", 7, new Date[]{ft.parse("5:10"),
                ft.parse("10:55"), ft.parse("16:40"), ft.parse("22:25")});
        trains[6] = new Train("Oxford", 14, new Date[]{ft.parse("7:50"),
                ft.parse("10:05"), ft.parse("12:40"), ft.parse("13:25"),
                ft.parse("15:55"), ft.parse("18:05"), ft.parse("21:35")});


        System.out.println("\nРасписание отсортированное по номеру поезда:" + Train.printSortByTrainNumber(trains));

        int userNumber = 14;
        System.out.println("\nИнформация о поезде номер " + userNumber + ":\t" +
                Train.searchByUserNumber(trains, userNumber));

        System.out.println("\nРасписание отсортированное по пункту назначения и по времени отправления" +
                Train.sortByDestinationByTime(trains));
    }
}
