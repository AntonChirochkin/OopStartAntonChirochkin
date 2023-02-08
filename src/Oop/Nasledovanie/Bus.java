package Oop.Nasledovanie;

public class Bus extends Transport {
    public Bus(String brand, String model, int productionYear, String productionCountry, String bodyWorkColor, double maxSpeed) {
        super(brand, model, productionYear, productionCountry, bodyWorkColor, maxSpeed);
    }
    @Override
    public String toString() {
        return "Bus{" +
                "Марка " + getBrand() + "," +
                " Модель " + getModel() + "," +
                " год выпуска " + getProductionYear() + "," +
                " Страна изготовления " + getProductionCountry() +
                " Цвет кузова " + getBodyWorkColor() +
                " Максимальная скорость " + getMaxSpeed() +
                '}';
    }
}
