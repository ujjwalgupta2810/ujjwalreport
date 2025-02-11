package vedalytics;
import java.util.Scanner;
// if-else use 
// Interface Displayable 
interface Displayable {
    void displayDetails();
}

// Abstract 
abstract class Person implements Displayable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter 
    public String getName() {
        return name;
    }
//Setter
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// Concrete class
class Student extends Person {
    private int rollNumber;

    public Student(String name, int rollNumber, int age) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Overriding method to display student details
    public void displayDetails() {
        System.out.println("Student [Name: " + getName() + ", Roll Number: " + rollNumber + ", Age: " + getAge() + "]");
    }

    // Method to display
    public void displayDetails(String message) {
        System.out.println(message);
        displayDetails(); // Also display details after the message
    }
}

// Main class to manage students
public class StudentManagementSystem {
    private static final int MAX_STUDENTS = 100;
    private static Student[] students = new Student[MAX_STUDENTS];
    private static int studentCount = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Display Student with Message");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    displayStudentWithMessage();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return; // Exit the loop and program
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Method to add a student
    private static void addStudent() {
        if (studentCount >= MAX_STUDENTS) {
            System.out.println("Cannot add more students. Maximum limit reached!");
            return;
        }

        System.out.print("Enter Student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Check if the student already exists by roll number
        if (findStudentByRollNumber(rollNumber) != null) {
            System.out.println("Student with this roll number already exists!");
            return;
        }

        Student newStudent = new Student(name, rollNumber, age);
        students[studentCount++] = newStudent;
        System.out.println("Student added successfully.");
    }

    // Method to find a student by their roll number
    private static Student findStudentByRollNumber(int rollNumber) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getRollNumber() == rollNumber) {
                return students[i];
            }
        }
        return null;
    }

    // Method to view all students
    private static void viewAllStudents() {
        if (studentCount == 0) {
            System.out.println("No students found!");
        } else {
            for (int i = 0; i < studentCount; i++) {
                students[i].displayDetails();
            }
        }
    }

    // Method to update student details
    private static void updateStudent() {
        System.out.print("Enter roll number of student to update: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Student student = findStudentByRollNumber(rollNumber);
        if (student != null) {
            System.out.print("Enter new name: ");
            student.setName(scanner.nextLine());
            System.out.print("Enter new age: ");
            student.setAge(scanner.nextInt());
            System.out.println("Student details updated.");
        } else {
            System.out.println("Student not found!");
        }
    }

    // Method to delete a student
    private static void deleteStudent() {
        System.out.print("Enter roll number of student to delete: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        for (int i = 0; i < studentCount; i++) {
            if (students[i].getRollNumber() == rollNumber) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--studentCount] = null;  // Nullify the last element
                System.out.println("Student deleted.");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // Method to display a student with a custom message
    private static void displayStudentWithMessage() {
        System.out.print("Enter roll number of student to display with message: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Student student = findStudentByRollNumber(rollNumber);
        if (student != null) {
            System.out.print("Enter message: ");
            String message = scanner.nextLine();
            student.displayDetails(message);
        } else {
            System.out.println("Student not found!");
        }
    }
}
