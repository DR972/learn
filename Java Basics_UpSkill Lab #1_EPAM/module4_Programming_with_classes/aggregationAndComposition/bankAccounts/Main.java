package by.epam.learn.main.modul4.aggregationAndComposition;

/**
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
 * имеющим положительный и отрицательный балансы отдельно.
 */

import java.util.ArrayList;

public class Main {
    static private final Bank BANK = new Bank("Альфа-Банк", new ArrayList<>());
    static private final String S = "----------------------------------------------------------------";

    public static void main(String[] args) {

        BANK.addClient("Ivan", "Ivanov", "KH1111111", new ArrayList<>());
        BANK.addClient("Petr", "Petrov", "KH3333333", new ArrayList<>());
        BANK.addClient("Sergei", "Sergeev", "KH2222222", new ArrayList<>());

        System.out.println("\n" + BANK.toString());
        topUpAnAccount();
        blockAccounts();
        findAllAccounts();
        findUnblockedAccounts();
    }

    private static void findAllAccounts() {
        for (Client clients : BANK.getClients()) {
            System.out.println(S + "\n" + clients.toString() + "все счета:" + "\n" + S);
            System.out.printf("%-26s %-27s %15s%n", "№ счета", "статус", "баланс" + "\n" + S);
            for (int i = 0; i < clients.getAccounts().size(); i++) {
                System.out.println(clients.getAccounts().get(i));
            }
        }
    }

    private static void findUnblockedAccounts() {
        System.out.println(S + "\n");
        for (Client clients : BANK.getClients()) {
            System.out.println(S + "\n" + clients.toString() + "доступные счета:" + "\n" + S);
            if (clients.unblockedAccounts().size() == 0) {
                System.out.println("Доступных счетов нет");
            } else for (int i = 0; i < clients.unblockedAccounts().size(); i++) {
                System.out.println(clients.unblockedAccounts().get(i));
            }
            System.out.println(S + "\nБаланс по всем счетам: " + clients.countTheAmount(clients.unblockedAccounts()));
            System.out.println("Баланс по положительным счетам: " + clients.countTheAmount(clients.positiveAccounts()));
            System.out.println("Баланс по отрицательным счетам: " + clients.countTheAmount(clients.negativeAccounts()));
        }
        System.out.println(S);
    }

    private static void topUpAnAccount() {
        for (Client clients : BANK.getClients()) {
            int numberAccount = (int) (Math.random() * 5 + 1);
            for (int i = 0; i < numberAccount; i++) {
                double sum = (double) ((int) ((Math.random() - 0.24) * 1000000)) / 100;
                clients.addAccount(new Account(sum));
            }
        }
    }

    private static void blockAccounts() {
        for (Client clients : BANK.getClients()) {
            for (int i = 0; i < clients.getAccounts().size(); i++) {
                if (Math.random() >= 0.33) {
                    clients.getAccounts().get(i).unBlock();
                } else clients.getAccounts().get(i).block();
            }
        }
    }
}