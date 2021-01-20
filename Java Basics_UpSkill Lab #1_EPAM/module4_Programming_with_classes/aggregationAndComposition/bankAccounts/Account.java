package by.epam.learn.main.modul4.aggregationAndComposition;

public class Account {
    private static long startNumber = 1_000_000_000;
    private final long number;
    private boolean status;
    private final double balance;

    public Account(double balance) {
        this.number = ++startNumber;
        this.balance = balance;
    }

    public boolean getStatus() {
        return status;
    }

    public double getBalance() {
        return balance;
    }

    public void block() {
        status = false;
    }

    public void unBlock() {
        status = true;
    }

    @Override
    public String toString() {
        String accountAccess;
        if (status) {
            accountAccess = "доступен";
        } else {
            accountAccess = "блокирован";
        }
        return String.format("%-25d %-20s %15.2f", number, accountAccess, balance);
    }
}
