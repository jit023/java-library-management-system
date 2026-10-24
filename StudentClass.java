class Student {
    private String name;
    private int id;
    private String department;
    private double cgpa;

    public Student(String name, int id, String department, double cgpa) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.cgpa = cgpa;
    }

    public void displayInfo() {
        System.out.println("--- Student Information ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
    }
}

// Class name file-er name-er sathe match kora holo
class StudentClass {
    public static void main(String[] args) {
        Student s1 = new Student("Rahim Ahmed", 101, "CSE", 3.85);
        s1.displayInfo();
    }
}