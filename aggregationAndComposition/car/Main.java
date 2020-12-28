package by.epam.learn.main.modul4.aggregationAndComposition;

public class Main {

    public static void main(String[] args) {
        String carModel = "Citroen C5";
        int diameter = 17;
        boolean unbroken = (Math.random() >= 0.5);
        int fuelConsumption = 9;
        int fuelQuantity = (int) (Math.random() * 60);
        int power = 159;

        Car car = new Car(carModel, new Engine(power, fuelQuantity, fuelConsumption), new Wheel(diameter, unbroken));
        System.out.println(car.toString());
        if (!car.checkWheels()) System.out.println("Проверь колеса, лопух!\nПоменял? Поехали.");
        if (car.countFuel() <= 10) System.out.println("Сначало на заправку!");
        System.out.println("Можно ехать км этак км " + car.goKm() + ".");
    }
}

