package by.epam.learn.main.modul5.createGiftsNew;

import by.epam.learn.main.modul5.createGiftsNew.menu.SelectionMenu;

/**
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * • Корректно спроектируйте и реализуйте предметную область задачи.
 * • Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.
 * • Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
 * • Для проверки корректности переданных данных можно применить регулярные выражения.
 * • Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
 * • Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
 * Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой подарок).
 * Составляющими целого подарка являются сладости и упаковка.
 */

public class CreateGifts {

    public static void main(String[] args) {
        SelectionMenu selectionMenu = new SelectionMenu();
        selectionMenu.letsGo();
    }
}
