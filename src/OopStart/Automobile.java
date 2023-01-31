package OopStart;

public class Automobile {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int productionYear;
    public String productionCountry;

    public Automobile(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = (brand == null ? "default" : brand);
        this.model = (model == null ? "default" : model);
        this.engineVolume = (engineVolume <= 0 ? 1.5 : engineVolume);
        this.color = (color == null ? "white" : color);
        this.productionYear = (productionYear <= 0 ? 2000 : productionYear);
        this.productionCountry = (productionCountry == null ? "default" : productionCountry);
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                '}';
    }


}
