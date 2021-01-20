package by.epam.learn.main.modul5.createGiftsNew.factory;

import by.epam.learn.main.modul5.createGiftsNew.model.Box;
import by.epam.learn.main.modul5.createGiftsNew.model.Candy;
import by.epam.learn.main.modul5.createGiftsNew.model.Chocolate;
import by.epam.learn.main.modul5.createGiftsNew.model.Gift;

import java.util.ArrayList;

public interface Builder {
    Gift getGift();

    void createGift();

    default Builder buildBox(Box box) {
        getGift().setBox(box);
        return this;
    }

    default Builder buildChocolate(Chocolate chocolate) {
        getGift().setChocolate(chocolate);
        return this;
    }

    default Builder buildCandies(ArrayList<Candy> candies) {
        getGift().setCandies(candies);
        return this;
    }

    void buildWeight();

    void buildPrice();

    default Builder buildComplementCandies(ArrayList<Candy> candies) {
        getGift().setCandies(candies);
        return this;
    }
}