import java.util.Scanner;

public class StudentManagement {
    private LinkedList studentList = new LinkedList();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter Student ID: ");
        Integer studentID = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter Score: ");
        double score = Double.parseDouble(scanner.nextLine());

        Student student = new Student(studentID, fullName, score);
        studentList.add(student);
        System.out.println("Student added successfully.");
    }

    public void editStudent() {
        System.out.print("Enter Student ID to edit: ");
        Integer studentID = Integer.parseInt(scanner.nextLine());

        Student student = studentList.search(studentID);
        if (student != null) {
            System.out.print("Enter new Full Name: ");
            String newFullName = scanner.nextLine();

            System.out.print("Enter new Score: ");
            double newScore = Double.parseDouble(scanner.nextLine());

            student.setFullName(newFullName);
            student.setScore(newScore);
            System.out.println("Student information updated.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        Integer studentID = Integer.parseInt(scanner.nextLine());
        studentList.delete(studentID);
        System.out.println("Student deleted if ID matched.");
    }

    public void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        Integer studentID = Integer.parseInt(scanner.nextLine());
        Student student = studentList.search(studentID);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }
    }

    public void displayStudents() {
        System.out.println("Student List:");
        studentList.display();
    }

    public void displayStudentsSortedByScore() {
        System.out.println("Student List (Sorted by Score):");
        studentList.displaySortedByScore();
    }
}
