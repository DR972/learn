package by.epam.learn.main.modul3.simpleClasess;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Train {
    private final String destination;
    private final int number;
    private final Date[] time;
    private final static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm");

    public Train(String destination, int number, Date[] time) {
        this.destination = destination;
        this.number = number;
        this.time = time;
    }

    static void sortByTrainNumber(Train[] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                if (trains[i].number > trains[j].number) {
                    temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                }
            }
        }
    }

    public static String printSortByTrainNumber(Train[] trains) {
        sortByTrainNumber(trains);
        StringBuilder trainNumber = new StringBuilder();
        for (Train train : trains) {
            trainNumber.append(String.format("%n%-5s", train.number)).append(String.format("%-11s", train.destination));
            for (Date times : train.time) {
                trainNumber.append("\t").append(DATE_FORMAT.format(times));
            }
        }
        return trainNumber.toString();
    }

    public static String searchByUserNumber(Train[] trains, int userNumber) {
        sortByTrainNumber(trains);
        StringBuilder numberUser = new StringBuilder();
        for (Train train : trains) {
            if (train.number == userNumber) {
                numberUser = new StringBuilder(String.format("%n%-5s", train.number) + String.format("%-11s", train.destination));
                for (Date times : train.time) {
                    numberUser.append("\t").append(DATE_FORMAT.format(times));
                }
            }
        }
        return numberUser.toString();
    }

    static void sortByDestination(Train[] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                if (trains[i].destination.compareTo(trains[j].destination) > 0) {
                    temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                }
            }
        }
    }

    static String sortByDestinationByTime(Train[] trains) {
        sortByDestination(trains);
        StringBuilder trainTime = new StringBuilder();
        for (int i = 0; i < trains.length; i++) {
            int o = 0;
            trainTime.append(String.format("%n%-13s", trains[i].destination));
            for (int j = i + 1; j < trains.length; j++) {
                if (trains[i].destination.compareTo(trains[j].destination) == 0) {
                    o++;
                    for (int k = 0; k < trains[i].time.length; k++) {
                        if (trains[i].time[k].before(trains[j].time[k])) {
                            trainTime.append("\t").append(DATE_FORMAT.format(trains[i].time[k])).
                                    append("\t").append(DATE_FORMAT.format(trains[j].time[k]));
                        } else
                            trainTime.append("\t").append(DATE_FORMAT.format(trains[j].time[k])).
                                    append("\t").append(DATE_FORMAT.format(trains[i].time[k]));
                    }
                }
            }
            if (o == 0) {
                for (Date times : trains[i].time) {
                    trainTime.append("\t").append(DATE_FORMAT.format(times));
                }
            } else i += o;
        }
        return trainTime.toString();
    }
}

