package by.epam.learn.main;

class Triangle {
    String s;
    public Triangle() {
        System.out.println("Задание 1.\nВведите число a:");
        Input a = new Input();
        System.out.println("Введите число b:");
        Input b = new Input();
        if ((180 - a.x - b.x) > 0) {
            s = "Такой треугольник существует.";
            if ((a.x + b.x) == 90) {
                s += "\nИ он прямоугольный.";
            }
        }
        else {
            s = "Такого треугольника не существует.";
        }
    }


    //public void setS(String s) {
    //    this.s = s;
    //}
}
