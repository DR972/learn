package by.epam.learn.main.modul5.createGiftsNew.factory;

import by.epam.learn.main.modul5.createGiftsNew.model.Box;
import by.epam.learn.main.modul5.createGiftsNew.model.Candy;
import by.epam.learn.main.modul5.createGiftsNew.model.Chocolate;
import by.epam.learn.main.modul5.createGiftsNew.model.Gift;

import java.util.ArrayList;

public class GiftBuilder implements Builder {
    private Gift gift;

    public void createGift() {
        gift = new Gift();
    }

    public Builder buildBox(Box box) {
        gift.setBox(box);
        return this;
    }

    public Builder buildChocolate(Chocolate chocolate) {
        getGift().setChocolate(chocolate);
        return this;
    }

    public Builder buildCandies(ArrayList<Candy> candies) {
        getGift().setCandies(candies);
        return this;
    }

    public void buildWeight() {
        getGift().setWeight(gift.getChocolate().getWeight() +
                gift.getCandies().stream().mapToInt(Candy::getWeight).sum());
    }

    public void buildPrice() {
        getGift().setPrice(gift.getBox().getPrice() + gift.getChocolate().getPrice()
                + gift.getCandies().stream().mapToDouble(Candy::getPrice).sum());
    }

    public Gift getGift() {
        return gift;
    }

    public Builder buildComplementCandies(ArrayList<Candy> candies) {
        getGift().setCandies(candies);
        return this;
    }
}