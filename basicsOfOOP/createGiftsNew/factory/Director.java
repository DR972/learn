package by.epam.learn.main.modul5.createGiftsNew.factory;

import by.epam.learn.main.modul5.createGiftsNew.menu.SelectionMenu;
import by.epam.learn.main.modul5.createGiftsNew.model.Gift;

import java.util.ArrayList;

public class Director {
    private final GiftBuilder builder = new GiftBuilder();

    public Gift buildGift() {
        builder.createGift();
        builder.buildBox(SelectionMenu.selectBox());
        builder.buildChocolate(SelectionMenu.selectChocolate());
        builder.buildCandies(SelectionMenu.addCandy(new ArrayList<>()));
        builder.buildPrice();
        builder.buildWeight();
        return builder.getGift();
    }

    public Gift complementGift() {
        builder.buildComplementCandies(SelectionMenu.addCandyByCustomer(builder.getGift().getCandies()));
        builder.buildPrice();
        builder.buildWeight();
        return builder.getGift();
    }
}