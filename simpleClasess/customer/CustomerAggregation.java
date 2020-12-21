package by.epam.learn.main.modul3.simpleClasess;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;

public class CustomerAggregation {
    private String market;
    private ArrayList<Customer> base;

    public CustomerAggregation(String market, ArrayList<Customer> base) {
        this.market = market;
        this.base = base;
    }

    void addCustomer (String lastName, String firstName, String patronymic, String address,
                      BigInteger cardNumber, long bankAccount){
        this.base.add(new Customer(lastName, firstName, patronymic, address, cardNumber, bankAccount));
    }

    void sortName(){
        base.sort(Comparator.comparing(Customer::getLastName));
    }

    ArrayList<Customer> sortCard(String min, String max){
        ArrayList<Customer> list = new ArrayList<>();
        for (Customer customer : this.base) {
            if (customer.getCardNumber().toString().compareTo(min) > 0
                    && customer.getCardNumber().toString().compareTo(max) < 0) {
                list.add(customer);
            }
        }
        return list;
    }

    public ArrayList<Customer> getBase() {
        return base;
    }

    public void setBase(ArrayList<Customer> base) {
        this.base = base;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }
}
