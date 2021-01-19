package by.epam.learn.main.modul5.createGifts.factory;

import by.epam.learn.main.modul5.createGifts.model.Box;
import by.epam.learn.main.modul5.createGifts.model.Candy;
import by.epam.learn.main.modul5.createGifts.model.Chocolate;
import by.epam.learn.main.modul5.createGifts.model.Gift;

import java.util.ArrayList;

public interface Builder {
    Gift getGift();

    void createGift();

    default Builder withBox(Box box){
        getGift().setBox(box);
        return this;
    }

    default Builder withChocolate(Chocolate chocolate){
        getGift().setChocolate(chocolate);
        return this;
    }

    default Builder withCandies(ArrayList<Candy> candies){
        getGift().setCandies(candies);
        return this;
    }

    default Builder withWeight(int weight){
        getGift().setWeight(weight);
        return this;
    }

    default Builder withPrice(double price) {
        getGift().setPrice(price);
        return this;
    }
}