package Oop.Polymorphism;

public class Lorry extends Transport<DriverC> {
    public Lorry(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void start() {
        System.out.println("Грузовик марки " + getBrand() + " начал движение.");
    }

    @Override
    public void finish() {
        System.out.println("Грузовик марки " + getBrand() + " закончил движение.");
    }
    @Override
    public void pitStop() {
        System.out.println("Пит-стоп грузовика");
    }

    @Override
    public void BestLapTimes() {
        int minVolumeMin = 9;
        int maxVolumeMin = 16;
        int bestLapTimesMin = (int) (maxVolumeMin + (maxVolumeMin - minVolumeMin) * Math.random()); // в данной строке мы привели значения к переменной int и создали формулу лучшего времени круга в минутах для грузовика
        System.out.println("Лучшее время круга для грузовика " + bestLapTimesMin +" минут.");
    }

    @Override
    public void maxSpeed() {
        int minVolume = 90;
        int maxVolume = 170;
        int maxSpeed = (int) (maxVolume + (maxVolume - minVolume) * Math.random()); // в данной строке мы привели значения к переменной int и создали формулу выборы случайного значения скорости в диапазоне от 100 до 200
        System.out.println("Максимальная скорость грузовика " + maxSpeed);
    }
}
