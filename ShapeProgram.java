import java.util.Scanner;

interface Shape {
    double area();
    double perimeter();
}

class Rectangle implements Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}

public class ShapeProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        Rectangle r = new Rectangle(length, breadth);

        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());

        sc.close();
    }
}