import java.util.Scanner;

class Calculator {

    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {

    // Parent class method
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // Method Overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator cal = new Calculator();

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum of two numbers: " + cal.add(a, b));

        System.out.print("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println("Sum of three numbers: " + cal.add(x, y, z));

        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.sound();
        dog.sound();

        sc.close();
    }
}