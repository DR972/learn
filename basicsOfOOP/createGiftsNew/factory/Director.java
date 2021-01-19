package by.epam.learn.main.modul5.createGiftsNew.factory;

import by.epam.learn.main.modul5.createGiftsNew.model.Gift;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Gift buildGift() {
        builder.createGift();
        builder.buildBox(builder.getGift().getBox());
        builder.buildChocolate(builder.getGift().getChocolate());
        builder.buildCandies(builder.getGift().getCandies());
        builder.buildPrice(builder.getGift().getPrice());
        builder.buildWeight(builder.getGift().getWeight());
        return builder.getGift();
    }

    public Gift complementGift() {
        builder.buildComplementCandies(builder.getGift().getCandies());
        builder.buildPrice(builder.getGift().getPrice());
        builder.buildWeight(builder.getGift().getWeight());
        return builder.getGift();
    }
}