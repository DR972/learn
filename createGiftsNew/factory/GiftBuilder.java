package by.epam.learn.main.modul5.createGifts.factory;

import by.epam.learn.main.modul5.createGifts.menu.SelectionMenu;
import by.epam.learn.main.modul5.createGifts.model.Box;
import by.epam.learn.main.modul5.createGifts.model.Candy;
import by.epam.learn.main.modul5.createGifts.model.Chocolate;
import by.epam.learn.main.modul5.createGifts.model.Gift;

import java.util.ArrayList;

public class GiftBuilder implements Builder {
    Gift gift;

    public void createGift() {
        gift = new Gift();
    }

    public Builder withBox(Box box){
        gift.setBox(SelectionMenu.selectBox());
        return this;
    }
    public Builder withChocolate(Chocolate chocolate){
        getGift().setChocolate(SelectionMenu.selectChocolate());
        return this;
    }

    public Builder withCandies(ArrayList<Candy> candies){
        getGift().setCandies(SelectionMenu.addCandy());
        return this;
    }

    public Builder withWeight(int weight){
        getGift().setWeight(gift.getChocolate().getWeight() + gift.getCandies().stream().mapToInt(Candy::getWeight).sum());
        return this;
    }

    public Builder withPrice(double price) {
        getGift().setPrice(gift.getBox().getPrice() + gift.getChocolate().getPrice()
                + gift.getCandies().stream().mapToDouble(Candy::getPrice).sum());
        return this;
    }

    public Gift getGift() {
        return gift;
    }
}