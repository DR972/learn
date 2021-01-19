package by.epam.learn.main.modul5.createGifts.factory;

import by.epam.learn.main.modul5.createGifts.model.Gift;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Gift buildGift() {
        builder.createGift();
        builder.withBox(builder.getGift().getBox());
        builder.withChocolate(builder.getGift().getChocolate());
        builder.withCandies(builder.getGift().getCandies());
        builder.withPrice(builder.getGift().getPrice());
        builder.withWeight(builder.getGift().getWeight());
        return builder.getGift();
    }
}