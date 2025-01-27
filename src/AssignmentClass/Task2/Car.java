package AssignmentClass.Task2;

public class Car {
    private final String model;
    private final int year;
    private final double gasolineTankCapacity;
    private final double topSpeed;


    // constructor with all parameters
    public Car(String model, int year, double gasolineTankCapacity, double topSpeed) {
        this.model = model;
        this.year = year;
        this.gasolineTankCapacity = gasolineTankCapacity;
        this.topSpeed = topSpeed;

    }

    // Getter methods
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getGasolineTankCapacity() {
        return gasolineTankCapacity;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

}
