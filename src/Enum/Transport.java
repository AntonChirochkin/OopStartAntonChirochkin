package Enum;

//
public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    private boolean diagnosticsPassed;


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume() {
        this.engineVolume = engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public Transport(String brand, String model, double engineVolume, T driver) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty() || model.isBlank()) {
            model = "default";
        }
        this.model = model;
        setEngineVolume(engineVolume);
        setDriver(driver);
    }

    private void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    public abstract Type getType();

    public abstract void printTipe();

    public abstract void start();

    public abstract void finish();

    public boolean isDiagnosticsPassed() {
        return diagnosticsPassed;
    }

    public boolean checkTransportNeedServise() {
        try {
            passDiagnostics();
        } catch (TransportTypeException e) {
            return false;
        }
        return true;
    }

    abstract boolean passDiagnostics() throws TransportTypeException;

    public boolean isDiagnosticPassed() {
        return diagnosticsPassed;
    }

     public void setDiagnosticsPassed(boolean diagnosticPassed) {
        this.diagnosticsPassed = diagnosticsPassed;
    }
}
