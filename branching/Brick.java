package by.epam.learn.main;

public class Brick {
    String s;
    int x = 65;
    int y = 120;

    public Brick() {
        System.out.println("\nЗадание 4.\nУ нас есть обычный кирпич (250x120x65).");
        System.out.println("Введите размеры отверстия, в которое он пройдет:");
        Input a = new Input();
        Input b = new Input();
        if ((Math.min(a.x, b.x) > x) && (Math.max(a.x, b.x) > y)) {
            s = "Супер, кирпич проходит в отверстие!";
        } else {
            s = "Не повезло, отверстие слишком маленькое.";
        }
    }
}
