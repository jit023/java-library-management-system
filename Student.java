import java.util.Scanner;

public class Student {
    String name;
    int age;
    double marks;

    void display() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        System.out.print("Enter student name: ");
        s1.name = sc.nextLine();

        System.out.print("Enter student age: ");
        s1.age = sc.nextInt();

        System.out.print("Enter student marks: ");
        s1.marks = sc.nextDouble();

        s1.display();

        sc.close();
    }
}