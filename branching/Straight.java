package by.epam.learn.main;

class Straight {
    String s;

    public Straight() {
        System.out.println("\nЗадание 3.\nВведите координаты точки А:");
        Input x1 = new Input();
        Input y1 = new Input();
        System.out.println("Введите координаты точки B:");
        Input x2 = new Input();
        Input y2 = new Input();
        System.out.println("Введите координаты точки C:");
        Input x3 = new Input();
        Input y3 = new Input();

        int a = y1.x - y2.x;
        int b = x2.x - x1.x;
        int c = x2.x * y1.x - x1.x * y2.x;
        if ((a * x3.x + b * y3.x) == -c) {
            s = "Да, эти точки расположены на одной прямой.";
        } else {
            s = "Нет, эти точки не находятся на одной прямой.";
        }
    }
}
