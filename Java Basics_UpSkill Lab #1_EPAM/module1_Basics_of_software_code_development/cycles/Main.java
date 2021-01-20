package by.epam.learn.main;

/**
 * 1. Напишите программу, где пользователь вводит любое целое положительное число.
 *      А программа суммирует все числа от 1 до введенного пользователем числа.
 * 2. Вычислить значения функции на отрезке [а,b] c шагом h:
 *       http://comp-science.narod.ru/executants/images/vich/vca1.jpg
 * 3. Найти сумму квадратов первых ста чисел.
 * 4. Составить программу нахождения произведения квадратов первых двухсот чисел.
 * 5. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 * 6. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
 * 7. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class Main {

    public static void main(String[] args) throws java.io.IOException {
        char choice, ignore;
        Choice chobj = new Choice();
        int o = 0;
        for (;;) {
            do {
                chobj.showMenu(o++);
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while(ignore != '\n');
            } while( !chobj.isvalid(choice) );
            if(choice == 'q') {
                System.out.println("\nНу как? Жду рекомендаций.");
                break;
            }
            System.out.println("\n");
            chobj.choiceOn(choice);
        }
    }
}
