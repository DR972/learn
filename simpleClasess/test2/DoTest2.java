package by.epam.learn.main.modul3.simpleClasess;

public class DoTest2 {

    public static void main(String[] args) {
        int a = 13;
        int b = 19;
        Test2 first = new Test2(a, b);
        Test2 second = new Test2();

        System.out.println("one A: " + first.getA());
        System.out.println("one B: " + first.getB());

        System.out.println("\nСмена переменных:");
        first.setA(20);
        first.setB(5);

        System.out.println("one A: " + first.getA());
        System.out.println("one B: " + first.getB());
        System.out.println("\ntwo A: " + second.getA());
        System.out.println("two B: " + second.getB());

        System.out.println("\nСмена переменных:");
        second.setA(13);
        second.setB(31);

        System.out.println("two A: " + second.getA());
        System.out.println("two B: " + second.getB());
    }
}
