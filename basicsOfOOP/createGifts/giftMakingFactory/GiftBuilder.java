package by.epam.learn.main.modul5.createGifts.giftMakingFactory;

import by.epam.learn.main.modul5.createGifts.constituentElements.Gift;

public abstract class GiftBuilder {
    Gift gift;

    void createGift() {
        gift = new Gift();
    }

    abstract void buildBox();

    abstract void buildChocolate();

    abstract void buildCandies();

    abstract void buildWeight();

    abstract void buildPrice();

    Gift getGift() {
        return gift;
    }
}