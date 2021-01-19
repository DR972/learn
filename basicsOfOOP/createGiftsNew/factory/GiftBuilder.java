package by.epam.learn.main.modul5.createGiftsNew.factory;

import by.epam.learn.main.modul5.createGiftsNew.menu.SelectionMenu;
import by.epam.learn.main.modul5.createGiftsNew.model.Box;
import by.epam.learn.main.modul5.createGiftsNew.model.Candy;
import by.epam.learn.main.modul5.createGiftsNew.model.Chocolate;
import by.epam.learn.main.modul5.createGiftsNew.model.Gift;

import java.util.ArrayList;

public class GiftBuilder implements Builder {
    Gift gift;

    public void createGift() {
        gift = new Gift();
    }

    public Builder buildBox(Box box) {
        gift.setBox(SelectionMenu.selectBox());
        return this;
    }

    public Builder buildChocolate(Chocolate chocolate) {
        getGift().setChocolate(SelectionMenu.selectChocolate());
        return this;
    }

    public Builder buildCandies(ArrayList<Candy> candies) {
        getGift().setCandies(SelectionMenu.addCandy(new ArrayList<>()));
        return this;
    }

    public Builder buildWeight(int weight) {
        getGift().setWeight(gift.getChocolate().getWeight() + gift.getCandies().stream().mapToInt(Candy::getWeight).sum());
        return this;
    }

    public Builder buildPrice(double price) {
        getGift().setPrice(gift.getBox().getPrice() + gift.getChocolate().getPrice()
                + gift.getCandies().stream().mapToDouble(Candy::getPrice).sum());
        return this;
    }

    public Gift getGift() {
        return gift;
    }

    public Builder buildComplementCandies(ArrayList<Candy> candies) {
        getGift().setCandies(SelectionMenu.addCandyByCustomer(candies));
        return this;
    }
}