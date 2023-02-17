package Enum;
//
public class Lorry extends Transport<DriverC> {

    LoadСapacity loadСapacity;

    public Lorry(String brand, String model, double engineVolume, DriverC driver, LoadСapacity loadСapacity) {
        super(brand, model, engineVolume, driver);
        this.loadСapacity = loadСapacity;
    }

    LoadСapacity getLoadСapacity() {
        return loadСapacity;
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
        System.out.println("Лучшее время круга для грузовика " + bestLapTimesMin + " минут.");
    }

    @Override
    public void maxSpeed() {
        int minVolume = 90;
        int maxVolume = 170;
        int maxSpeed = (int) (maxVolume + (maxVolume - minVolume) * Math.random()); // в данной строке мы привели значения к переменной int и создали формулу выборы случайного значения скорости в диапазоне от 100 до 200
        System.out.println("Максимальная скорость грузовика " + maxSpeed);
    }
}

enum LoadСapacity {
    N1(0f, 3.5f),
    N2(3.6f, 12f),
    N3(12.1f, 12.9f);
    private Float loadMin;
    private Float loadMax;

    LoadСapacity(Float loadMin, Float loadMax) {
        this.loadMin = loadMin;
        this.loadMax = loadMax;
    }

     public float getLoadMin() {
        return loadMin;
    }
    public void setLoadMin(Float loadMin) {
        this.loadMin = loadMin;
    }
    public float getLoadMax() {
        return loadMax;
    }
    public void setLoadMax(Float loadMax) {
        this.loadMax = loadMax;
    }
    @Override
    public String toString() {
        return "loadMin=" + loadMin +
                ", loadMax=" + loadMax +
                '}';
    }
}
