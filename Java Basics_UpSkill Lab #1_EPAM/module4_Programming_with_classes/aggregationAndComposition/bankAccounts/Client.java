package by.epam.learn.main.modul4.aggregationAndComposition;

import java.util.ArrayList;
import java.util.Comparator;

public class Client {
    private final String firstName;
    private final String lastName;
    private final String passport;
    private final ArrayList<Account> accounts;

    public Client(String firstName, String lastName, String passport, ArrayList<Account> accounts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passport = passport;
        this.accounts = accounts;
    }

    void addAccount(Account account) {
        accounts.add(account);
        accounts.sort(Comparator.comparing(Account::getBalance));
    }

    ArrayList<Account> unblockedAccounts() {
        ArrayList<Account> accounts = new ArrayList<>();
        for (Account account : this.accounts) {
            if (account.getStatus()) accounts.add(account);
        }
        return accounts;
    }

    ArrayList<Account> positiveAccounts() {
        ArrayList<Account> accounts = new ArrayList<>();
        for (Account account : unblockedAccounts()) {
            if (account.getBalance() > 0) accounts.add(account);
        }
        return accounts;
    }

    ArrayList<Account> negativeAccounts() {
        ArrayList<Account> accounts = new ArrayList<>();
        for (Account account : unblockedAccounts()) {
            if (account.getBalance() < 0) accounts.add(account);
        }
        return accounts;
    }

    public String countTheAmount(ArrayList<Account> accounts) {
        double sum = 0;
        for (Account account : accounts) {
            sum += account.getBalance();
        }
        return String.format("%.2f", sum);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return String.format("%-8s %-10s %-15s", firstName, lastName, passport);
    }
}
