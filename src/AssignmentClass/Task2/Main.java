package AssignmentClass.Task2;
public class Main {
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car("Toyota Camry", 2020, 15.5, 120.0);

        // access

        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Gasoline Tank Capacity: " + myCar.getGasolineTankCapacity() + " gallons");
        System.out.println("Top Speed: " + myCar.getTopSpeed() + " mph");
    }
}


