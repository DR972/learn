package by.epam.learn.main.modul4.aggregationAndComposition;

import java.util.ArrayList;

public class Bank {
    private final String name;
    private final ArrayList<Client> clients;

    public Bank(String name, ArrayList<Client> clients) {
        this.name = name;
        this.clients = clients;
    }

    void addClient(String firstName, String lastName, String passport, ArrayList<Account> accounts) {
        clients.add(new Client(firstName, lastName, passport, accounts));
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    @Override
    public String toString() {
        return name + "\tсводная информация по всем клиентам.";
    }
}
