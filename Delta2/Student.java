
//CONSTRUCTOR


public class Student {
    // Instance variables
    String name;
    int age;

    // Constructor - used for initialization
    Student(String n, int a) {
        name = n;       // assigning value to name
        age = a;        // assigning value to age
        System.out.println("Constructor called.");
    }

    // Method to display student details
    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method - used for instantiation
    public static void main(String[] args) {
        // Instantiation: creating object of Student
        Student s1 = new Student("Rahul", 22);  // constructor is called here
        s1.showDetails();
    }
    
}