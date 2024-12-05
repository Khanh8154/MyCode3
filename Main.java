import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Choose an option:");
                System.out.println("1. Add Student");
                System.out.println("2. Edit Student");
                System.out.println("3. Delete Student");
                System.out.println("4. Search Student by ID");
                System.out.println("5. Display All Students");
                System.out.println("6. Display Students Sorted by Score");
                System.out.println("7. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        management.addStudent();
                        break;
                    case 2:
                        management.editStudent();
                        break;
                    case 3:
                        management.deleteStudent();
                        break;
                    case 4:
                        management.searchStudent();
                        break;
                    case 5:
                        management.displayStudents();
                        break;
                    case 6:
                        management.displayStudentsSortedByScore();
                        break;
                    case 7:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
                scanner.nextLine(); // Clear buffer
            }
        }
    }
}

//public class ConstantTime {
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5};
//        int index = 2;
//        System.out.println(array[index]);
//    }
//}
//
//public class LinearTime {
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5};
//        int target = 4;
//        boolean found = false;
//        for (int i : array) {
//            if (i == target) {
//                found = true;
//                break;
//            }
//        }
//        System.out.println(found);
//    }
//}
//
//public class LogarithmicTime {
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5};
//        int target = 3;
//        int left = 0;
//        int right = array.length - 1;
//        boolean found = false;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (array[mid] == target) {
//                found = true;
//                break;
//            }
//            if (array[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        System.out.println(found);
//    }
//}
//
//public class QuadraticTime {
//    public static void main(String[] args) {
//        int[] array = {5, 1, 4, 2, 8};
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - i - 1; j++) {
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//        for (int i : array) {
//            System.out.print(i + " ");
//        }
//    }
//}
//
//public class LinearithmicTime {
//    public void mergeSort(int[] array, int left, int right) {
//        if (left < right) {
//            int mid = (left + right) / 2;
//            mergeSort(array, left, mid);
//            mergeSort(array, mid + 1, right);
//            merge(array, left, mid, right);
//        }
//    }
//
//    public void merge(int[] array, int left, int mid, int right) {
//        int n1 = mid - left + 1;
//        int n2 = right - mid;
//        int[] L = new int[n1];
//        int[] R = new int[n2];
//        for (int i = 0; i < n1; ++i) L[i] = array[left + i];
//        for (int j = 0; j < n2; ++j) R[j] = array[mid + 1 + j];
//        int i = 0, j = 0;
//        int k = left;
//        while (i < n1 && j < n2) {
//            if (L[i] <= R[j]) {
//                array[k] = L[i];
//                i++;
//            } else {
//                array[k] = R[j];
//                j++;
//            }
//            k++;
//        }
//        while (i < n1) {
//            array[k] = L[i];
//            i++;
//            k++;
//        }
//        while (j < n2) {
//            array[k] = R[j];
//            j++;
//            k++;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] array = {12, 11, 13, 5, 6, 7};
//        LinearithmicTime ob = new LinearithmicTime();
//        ob.mergeSort(array, 0, array.length - 1);
//        for (int i : array) {
//            System.out.print(i + " ");
//        }
//    }
//}
//public class ArrayExample {
//    public static void main(String[] args) {
//        int[] array = new int[5];
//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
//        array[3] = 4;
//        array[4] = 5;
//        // Access 3rd element
//        System.out.println(array[2]); // O(1)
//
//        // Insert element at position 2 (must move other elements)
//        int[] newArray = new int[6];
//        for (int i = 0; i < 2; i++) newArray[i] = array[i];
//        newArray[2] = 6;
//        for (int i = 2; i < array.length; i++) newArray[i + 1] = array[i];
//
//        for (int i : newArray) System.out.print(i + " "); // Result: 1 2 6 3 4 5
//    }
//}

//public class LinkedListExample {
//    private static class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    private Node head;
//
//    public LinkedListExample() {
//        this.head = null;
//    }
//
//    public void add(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//        } else {
//            Node temp = head;
//            while (temp.next != null) {
//                temp = temp.next;
//            }
//            temp.next = newNode;
//        }
//    }
//
//    public void insertAtPosition(int position, int data) {
//        Node newNode = new Node(data);
//        if (position == 0) {
//            newNode.next = head;
//            head = newNode;
//        } else {
//            Node temp = head;
//            for (int i = 0; i < position - 1 && temp != null; i++) {
//                temp = temp.next;
//            }
//            if (temp != null) {
//                newNode.next = temp.next;
//                temp.next = newNode;
//            }
//        }
//    }
//
//    public void display() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//    }
//
//    public static void main(String[] args) {
//        LinkedListExample list = new LinkedListExample();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.display(); // Result: 1 2 3 4 5
//
//        list.insertAtPosition(2, 6);
//        list.display(); // Result: 1 2 6 3 4 5
//    }
//}
