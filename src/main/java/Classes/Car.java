package Classes;

public class Car {
    private Manufacturer manufacturer;
    private EngineType engineType;
    private double price;

    public Car(){};

    public Car(Manufacturer manufacturer, EngineType engineType, double price) {
        this.manufacturer = manufacturer;
        this.engineType = engineType;
        this.price = price;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public double getPrice() {
        return price;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer=" + manufacturer +
                ", engineType=" + engineType +
                ", price=" + price +
                '}';
    }
}




