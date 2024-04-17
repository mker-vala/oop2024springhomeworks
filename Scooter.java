package homeworks.hw1.scooter;

/**
 * Represents a scooter.
 */
public class Scooter {

    // Unique identifier for the scooter.
    private int id;

    // Model name of the scooter (e.g., Sparrow X10).
    private String model;

    // Current battery level (percentage).
    private int batteryLevel;

    // Scooter location;
    private double x, y;

    // Indicates if the scooter is available
    private boolean available;

    // Constructor
    public Scooter(String model, int batteryLevel, double x, double y, boolean available) {
        this.model = model;
        this.batteryLevel = batteryLevel;
        this.x = x;
        this.y = y;
        this.available = available;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Scooter{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", batteryLevel=" + batteryLevel +
                ", x=" + x +
                ", y=" + y +
                ", available=" + available +
                '}';
    }
}
