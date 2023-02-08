package Oop.Nasledovanie;

import java.util.regex.Pattern;

public class Car extends Transport {
    private double engineCapacityInliters;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private double numberOfPlaces;

    public Car(String brand, String model, int productionYear, String productionCountry, String bodyWorkColor, int maxSpeed, double engineCapacityInliters, String transmission, String bodyType, String registrationNumber, double numberOfPlaces) {
        super(brand, model, productionYear, productionCountry, bodyWorkColor, maxSpeed);
        this.engineCapacityInliters = validateEngineCapacityInliters(engineCapacityInliters);
        this.transmission = validateString(transmission);
        this.bodyType = validateString(bodyType);
        this.registrationNumber = validateCarNumber(registrationNumber);;
        this.numberOfPlaces = validatenumberOfPlaces(numberOfPlaces);
    }



    public double getEngineCapacityInliters() {
        return engineCapacityInliters;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public double getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public void setEngineCapacityInliters(double engineCapacityInliters) {
        this.engineCapacityInliters = engineCapacityInliters;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setNumberOfPlaces(int numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }
    public String validateCarNumber(String registrationNumber) {
        if (Pattern.matches("[A-Z][0-9]{3}[A-Z]{2}[0-9]{3}", registrationNumber)) {
            return registrationNumber;
        } else {
            System.out.println("Номер некорректный");
            return "неверный номер";
        }
    }
    public static double validateEngineCapacityInliters(double value) {
        return value < 0 ? 1.5 : value;
    }
    public static double validatenumberOfPlaces(double value) {
        return value < 0 ? 5 : value;
    }
    public static String validateString(String value) {
        return (value == null || value.isBlank() || value.isEmpty()) ? "default" : value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Марка " + getBrand() +"," +
                " Модель " + getModel() + "," +
                " Год выпуска " + getProductionYear() + "," +
                " Страна производитель " + getProductionCountry() + "," +
                " Цвет кузова " + getBodyWorkColor() + "," +
                " Максимальная скорость " + getMaxSpeed() + "," +
                " engineCapacityInliters=" + engineCapacityInliters +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfPlaces=" + numberOfPlaces +

                '}';
    }

}
