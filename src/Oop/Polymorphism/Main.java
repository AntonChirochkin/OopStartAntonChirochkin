package Oop.Polymorphism;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB("Driver cat. B №" + i, true, 5 + i);

            Car car = new Car("Audi", "SQ8", 435, driverB);
            Car car2 = new Car("BMV", "X7", 530, driverB);
            Car car3 = new Car("Mersedes", "GLS", 612, driverB);
            Car car4 = new Car("Porsche", "Cayenne", 680, driverB);

            DriverD driverD = new DriverD("Driver cat. D №" + i, true, 10 + i);
            Bus bus = new Bus("Лиаз", "667", 175, driverD);
            Bus bus2 = new Bus("ЛАЗ", "695", 150, driverD);
            Bus bus3 = new Bus("Икарус", "250 SL", 258, driverD);
            Bus bus4 = new Bus("Volvo", "8900", 350, driverD);

            DriverC driverC = new DriverC("Driver cat. C №" + i, true, 7 + i);
            Lorry lorry = new Lorry("Камаз", "5490", 428, driverC);
            Lorry lorry2 = new Lorry("Scania", "R", 730, driverC);
            Lorry lorry3 = new Lorry("Iveco", "S-Way", 400, driverC);
            Lorry lorry4 = new Lorry("DAF", "XF 105", 456, driverC);

            printInfo(car);
            printInfo(car2);
            printInfo(car3);
            printInfo(car4);

            printInfo(bus);
            printInfo(bus2);
            printInfo(bus3);
            printInfo(bus4);

            printInfo(lorry);
            printInfo(lorry2);
            printInfo(lorry3);
            printInfo(lorry4);
        }
    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет учавствовать в заезде.");
    }
}
