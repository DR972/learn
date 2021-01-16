package by.epam.learn.main.modul5.createGifts.giftMakingFactory;

import by.epam.learn.main.modul5.createGifts.constituentElements.Gift;

public class FactoryManagement {
    GiftBuilder giftBuilder;

    public void setGiftBuilder(GiftBuilder giftBuilder) {
        this.giftBuilder = giftBuilder;
    }

    public Gift buildGift() {
        giftBuilder.createGift();
        giftBuilder.buildBox();
        giftBuilder.buildChocolate();
        giftBuilder.buildCandies();
        giftBuilder.buildPrice();
        giftBuilder.buildWeight();
        return giftBuilder.getGift();
    }
}