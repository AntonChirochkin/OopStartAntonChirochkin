package Oop.Nasledovanie;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi",
                "Q8",
                2023,
                "Germany",
                "Black",
                300,
                12,
                "Automat",
                "",
                "A777CC196",
                5);

        Car car2 = new Car("BMV",
                "X7",
                2023,
                "Germany",
                "white",
                270,
                6.0,
                "Automat",
                "",
                "A888CC196",
                5);

        Car car3 = new Car("Mersedes",
                "GLS",
                2023,
                "Germany",
                "red",
                250,
                8.0,
                "Automat",
                "",
                "A555CC196",
                7);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        Bus bus1 = new Bus("Лиаз", "667", 1974, "Советский союз", "Желтый", 105);
        Bus bus2 = new Bus("ЛАЗ", "695", 1971, "Советский союз", "", 115);
        Bus bus3 = new Bus("Икарус", "250 SL", 1962, "Венгрия", "Красный", 105);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
    }
}

