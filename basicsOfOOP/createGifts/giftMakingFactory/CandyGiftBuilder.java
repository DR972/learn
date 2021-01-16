package by.epam.learn.main.modul5.createGifts.giftMakingFactory;

import by.epam.learn.main.modul5.createGifts.compositionGift.SelectionMenu;
import by.epam.learn.main.modul5.createGifts.constituentElements.Candy;

public class CandyGiftBuilder extends GiftBuilder {

    @Override
    void buildBox() {
        gift.setBox(SelectionMenu.selectBox());
    }

    @Override
    void buildChocolate() {
        gift.setChocolate(SelectionMenu.selectChocolate());
    }

    @Override
    void buildCandies() {
        gift.setCandies(SelectionMenu.addCandy());
    }

    @Override
    void buildWeight() {
        gift.setWeight(gift.getChocolate().getWeight() + gift.getCandies().stream().mapToInt(Candy::getWeight).sum());
    }

    @Override
    void buildPrice() {
        gift.setPrice(gift.getBox().getPrice() + gift.getChocolate().getPrice()
                + gift.getCandies().stream().mapToDouble(Candy::getPrice).sum());
    }
}