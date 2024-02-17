package model.cars;

// Represents a car, with stats and specifications and a price in dollars
public class Car {

    private String manufacturer;
    private String model;
    private int year;
    private double speed;
    private double handling;
    private double acceleration;
    private double braking;
    private DriveType driveType;
    private int price;

    // EFFECTS: constructs a new car with the given stats and specifications
    public Car(String manufacturer, String model, int year, double speed, double handling,
               double acceleration, double braking, DriveType driveType, int price) {

        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.handling = handling;
        this.acceleration = acceleration;
        this.braking = braking;
        this.driveType = driveType;
        this.price = price;
    }

    // getters
    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public double getHandling() {
        return handling;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public double getBraking() {
        return braking;
    }

    public DriveType getDriveType() {
        return driveType;
    }

    public int getPrice() {
        return price;
    }
}
