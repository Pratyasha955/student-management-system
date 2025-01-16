import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade;
    }
}

public class StudentManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = getIntInput("Enter your choice: ");
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private static void showMenu() {
        System.out.println("\nWelcome to Student Management System");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Search Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Exit");
    }

    private static void addStudent() {
        System.out.println("\nAdd New Student");
        String name = getStringInput("Enter name: ");
        int rollNumber;
        while (true) {
            rollNumber = getIntInput("Enter roll number: ");
            if (isRollNumberUnique(rollNumber)) {
                break;
            } else {
                System.out.println("Roll number already exists. Please enter a unique roll number.");
            }
        }
        String grade = getStringInput("Enter class/grade: ");
        students.add(new Student(name, rollNumber, grade));
        System.out.println("Student added successfully.");
    }

    private static void viewStudents() {
        System.out.println("\nView All Students");
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    private static void searchStudent() {
        System.out.println("\nSearch Student");
        int rollNumber = getIntInput("Enter roll number to search: ");
        Student student = findStudentByRollNumber(rollNumber);
        if (student != null) {
            System.out.println("Student found: " + student);
        } else {
            System.out.println("No student found with roll number " + rollNumber);
        }
    }

    private static void deleteStudent() {
        System.out.println("\nDelete Student");
        int rollNumber = getIntInput("Enter roll number to delete: ");
        Student student = findStudentByRollNumber(rollNumber);
        if (student != null) {
            students.remove(student);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("No student found with roll number " + rollNumber);
        }
    }

    private static boolean isRollNumberUnique(int rollNumber) {
        return findStudentByRollNumber(rollNumber) == null;
    }

    private static Student findStudentByRollNumber(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    private static int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}
