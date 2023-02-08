package Oop.Nasledovanie;

public class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String bodyWorkColor;
    private double maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String bodyWorkColor, double maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.bodyWorkColor = validateString(bodyWorkColor);
        this.maxSpeed = validateMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyWorkColor() {
        return bodyWorkColor;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setBodyWorkColor(String bodyWorkColor) {
        this.bodyWorkColor = bodyWorkColor;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public static String validateString(String value) {
        return (value == null || value.isBlank() || value.isEmpty()) ? "default" : value;
    }
    public static double validateMaxSpeed(double value) {
        return value < 0 ? 10 : value;
    }
}
