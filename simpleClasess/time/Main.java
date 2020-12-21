package by.epam.learn.main.modul3.simpleClasess;

public class Main {

    public static void main(String[] args) {
        int givenHour = (int) (Math.random() * 100 - 30);
        int givenMinute = (int) (Math.random() * 100 - 30);
        int givenSecond = (int) (Math.random() * 100 - 30);
        System.out.printf("Устанавливаем время: %02d:%02d:%02d%n", givenHour, givenMinute, givenSecond);
        Time time = new Time(givenHour, givenMinute, givenSecond);
        System.out.printf("Время после корректировки: %02d:%02d:%02d%n", time.checkHour(givenHour),
                time.checkMinute(givenMinute), time.checkMinute(givenSecond));

        int changeHour = (int) (Math.random() * 100 - 30);
        int changeMinute = (int) (Math.random() * 100 - 30);
        int changeSecond = (int) (Math.random() * 100 - 30);
        System.out.printf("Изменяем время на: %02d:%02d:%02d%n", changeHour, changeMinute, changeSecond);
        System.out.printf("Корректировка изменений: %02d:%02d:%02d%n", time.checkHour(changeHour),
                time.checkMinute(changeMinute), time.checkMinute(changeSecond));

        System.out.println("Новое время: " + time.changeTime(changeHour, changeMinute, changeSecond));
    }
}