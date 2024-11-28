import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void add(Student student) {
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public Student search(Integer studentID) {
        Node current = head;
        while (current != null) {
            if (current.getStudent().getStudentID().equals(studentID)) {
                return current.getStudent();
            }
            current = current.getNext();
        }
        return null;
    }

    public void delete(Integer studentID) {
        if (head == null) return;

        if (head.getStudent().getStudentID().equals(studentID)) {
            head = head.getNext();
            return;
        }

        Node current = head;
        while (current.getNext() != null) {
            if (current.getNext().getStudent().getStudentID().equals(studentID)) {
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getStudent());
            current = current.getNext();
        }
    }

    public void displaySortedByScore() {
        List<Student> studentList = toArrayList();
        studentList.sort((s1, s2) -> Double.compare(s1.getScore(), s2.getScore()));
        studentList.forEach(System.out::println);
    }

    private List<Student> toArrayList() {
        List<Student> students = new ArrayList<>();
        Node current = head;
        while (current != null) {
            students.add(current.getStudent());
            current = current.getNext();
        }
        return students;
    }
}

