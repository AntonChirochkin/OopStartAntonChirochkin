package Enum;
//
public class Bus extends Transport<DriverD> {
    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void start() {
        System.out.println("Автобус марки " + getBrand() + " начал движение.");
    }

    @Override
    public void finish() {
        System.out.println("Автобус марки " + getBrand() + " закончил движение.");
    }
    @Override
    public void pitStop() {
        System.out.println("Пит-стоп автобуса");
    }

    @Override
    public void BestLapTimes() {
        int minVolumeMin = 6;
        int maxVolumeMin = 14;
        int bestLapTimesMin = (int) (maxVolumeMin + (maxVolumeMin - minVolumeMin) * Math.random()); // в данной строке мы привели значения к переменной int и создали формулу лучшего времени круга в минутах для автобусов
        System.out.println("Лучшее время круга для автобуса " + bestLapTimesMin +" минут.");
    }

    @Override
    public void maxSpeed() {
        int minVolume = 60;
        int maxVolume = 170;
        int maxSpeed = (int) (maxVolume + (maxVolume - minVolume) * Math.random()); // в данной строке мы привели значения к переменной int и создали формулу выборы случайного значения скорости в диапазоне от 100 до 200
        System.out.println("Максимальная скорость автобуса " + maxSpeed);
    }
}
