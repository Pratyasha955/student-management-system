# Student Management System

This is a simple command-line-based **Student Management System** written in Java. It allows you to manage student records efficiently, providing features such as adding, viewing, searching, and deleting student information.

## Features

1. **Add Student**
   - Add a new student with the following details:
     - Name
     - Roll Number (must be unique)
     - Grade/Class

2. **View Students**
   - Display a list of all students with their details.

3. **Search Student**
   - Search for a student using their roll number.

4. **Delete Student**
   - Remove a student from the system using their roll number.

5. **Exit**
   - Exit the application.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- A text editor or IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code)

## How to Run

1. Clone the repository or download the source code:
   ```
   git clone <repository-link>
   ```

2. Navigate to the project directory.

3. Compile the Java program:
   ```
   javac StudentManagementSystem.java
   ```

4. Run the program:
   ```
   java StudentManagementSystem
   ```

## Usage

1. Upon running the program, a menu will appear with the following options:
   ```
   Welcome to Student Management System
   1. Add Student
   2. View Students
   3. Search Student
   4. Delete Student
   5. Exit
   Enter your choice:
   ```

2. Follow the prompts to interact with the system.

3. Input validation is in place to ensure data integrity:
   - Roll numbers must be unique.
   - Numeric inputs are validated to prevent errors.

## Example

Here is an example interaction with the system:

```
Welcome to Student Management System
1. Add Student
2. View Students
3. Search Student
4. Delete Student
5. Exit
Enter your choice: 1

Add New Student
Enter name: pratyasha
Enter roll number: 101
Enter class/grade: 10
Student added successfully.

Enter your choice: 2

View All Students
Name: pratyasha, Roll Number: 101, Grade: 10

Enter your choice: 5
Exiting... Goodbye!
```




