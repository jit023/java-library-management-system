// Base class (Superclass)
class Vehicle {
    protected String brand;
    protected int year;
    protected String color;

    // Constructor for Vehicle
    public Vehicle(String brand, int year, String color) {
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    // Method to display general info
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }
}

// Subclass Car inherits from Vehicle
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int year, String color, int numberOfDoors) {
        super(brand, year, color); // Constructor chaining using super
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Calling parent class method
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Subclass Motorcycle inherits from Vehicle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, String color, boolean hasSidecar) {
        super(brand, year, color); // Constructor chaining using super
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Calling parent class method
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

// Main Class to test inheritance
public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("=== Car Information ===");
        Car myCar = new Car("Toyota", 2022, "Red", 4);
        myCar.displayInfo();

        System.out.println("\n=== Motorcycle Information ===");
        Motorcycle myBike = new Motorcycle("Yamaha", 2023, "Black", false);
        myBike.displayInfo();
    }
}