package by.epam.learn.main.modul3.simpleClasess;

import java.math.BigInteger;

public class Customer {
    private static int startID = 1;
    private int id;
    private final String lastName;
    private final String firstName;
    private final String patronymic;
    private final String address;
    private final BigInteger cardNumber;
    private final long bankAccount;

    public Customer(String lastName, String firstName, String patronymic, String address,
                    BigInteger cardNumber, long bankAccount) {
        this.id = startID++;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankAccount = bankAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public BigInteger getCardNumber() {
        return cardNumber;
    }

    public long getBankAccount() {
        return bankAccount;
    }

    @Override
    public String toString() {
        return String.format("%-3s %-12s %-10s %-14s %-10s %-20s %s",
                id, lastName, firstName, patronymic, address, cardNumber, bankAccount);
    }
}
