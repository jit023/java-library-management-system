import java.util.Scanner;

class Vehicle {
    String brand;
    String model;
    int year;

    void display() {
        System.out.println("\nVehicle Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class VehicleProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicle v = new Vehicle();

        System.out.print("Enter vehicle brand: ");
        v.brand = sc.nextLine();

        System.out.print("Enter vehicle model: ");
        v.model = sc.nextLine();

        System.out.print("Enter manufacturing year: ");
        v.year = sc.nextInt();

        v.display();

        sc.close();
    }
}