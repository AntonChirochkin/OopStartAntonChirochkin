package Oop.Encapsulation.transport;

import java.util.regex.Pattern;

public class Car {
    private final String brand;
    private final String model;
    private double engineCapacityInliters;
    private String bodyworkColor;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfPlaces;

    private boolean winterSummer;

    private Key key;



    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacityInliters() {
        return engineCapacityInliters;
    }

    public String getBodyworkColor() {
        return bodyworkColor;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
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

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public boolean isWinterSummer() {
        return winterSummer;
    }

    public Key getKey() {
        return key;
    }

    public void setEngineCapacityInliters(double engineCapacityInliters) {
        this.engineCapacityInliters = engineCapacityInliters;
    }

    public void setBodyworkColor(String bodyworkColor) {
        this.bodyworkColor = bodyworkColor;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setWinterSummer(boolean winterSummer) {
        this.winterSummer = winterSummer;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Car(String brand, String model, Double engineCapacityInliters, String bodyworkColor, int productionYear, String productionCountry, String transmission, String bodyType, String registrationNumber, int numberOfPlaces, boolean winterSummer) {
        this.brand = ((brand == null || brand == " ") ? "default" : brand);
        this.model = ((model == null || model == " ") ? "default" : model);
        this.engineCapacityInliters = validateEngineCapacityInliters(engineCapacityInliters);
        this.bodyworkColor = ((bodyworkColor == null || bodyworkColor == " ") ? "default" : bodyworkColor);
        this.productionYear = ((productionYear > 2023 || productionYear == 0) ? 2000 : productionYear);
        this.productionCountry = ((productionCountry == null || productionCountry == " ") ? "default" : productionCountry);
        this.transmission = ((transmission == null || transmission == " ") ? "default" : transmission);
        this.bodyType = ((bodyType == null || bodyType == " ") ? "default" :bodyType);
        this.registrationNumber = validateCarNumber(registrationNumber);
        this.numberOfPlaces = (numberOfPlaces == 0 ? 5 : numberOfPlaces);
        this.winterSummer = winterSummer;
        this.key = key;


    }

    public void winterSummer(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            winterSummer = false;
        }
        if (month >= 4 && month <= 10) {
            winterSummer = true;
        }
    }

    public String validateCarNumber(String registrationNumber) {
        if (Pattern.matches("[A-Z][0-9]{3}[A-Z]{2}[0-9]{3}", registrationNumber)) {
            return registrationNumber;
        } else {
            System.out.println("Номер некорректный");
            return "неверный номер";
        }
    }
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineCapacityInliters=" + engineCapacityInliters +
                ", bodyworkColor='" + bodyworkColor + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfPlaces=" + numberOfPlaces +
                ", winterSummer=" + winterSummer +
                ", key=" + key +
                '}';
    }
    public static class Key {
        private final boolean remoteStart;
        private final boolean keylessAccess;

        public Key(boolean remoteStart, boolean keylessAccess) {
            this.remoteStart = remoteStart;
            this.keylessAccess = keylessAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteStart=" + remoteStart +
                    ", keylessAccess=" + keylessAccess +
                    '}';
        }
    }

    public static double validateEngineCapacityInliters(double value) {
        return value < 0 ? 1.5 : value;
    }


}


