package by.epam.learn.main;

class MaxMin {
    int m;

    public MaxMin() {
        System.out.println("\nЗадание 2.");
        System.out.println("Введите 4 целых числа, после каждого Enter.");
        Input a = new Input();
        Input b = new Input();
        Input c = new Input();
        Input d = new Input();
        m = Math.max(Math.min(a.x, b.x), Math.min(c.x, d.x));
    }
}
