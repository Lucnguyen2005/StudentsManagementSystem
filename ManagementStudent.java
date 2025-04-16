package Com.btec.assignment.lucnt;
import java.util.*;
public class ManagementStudent {
    private ArrayList<Student> students = new ArrayList<>();
    private HashMap<String, Student> studentMap = new HashMap<>();
    public void addStudent(Student s) {
        if (!studentMap.containsKey(s.getStudentId())) {
            students.add(s);
            studentMap.put(s.getStudentId(), s);
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Duplicate ID. Student already exists.");
        }
    }
    public void deleteStudent(String id) {
        Student s = studentMap.get(id);
        if (s != null) {
            students.remove(s);
            studentMap.remove(id);
            System.out.println("Student deleted.");
        } else {
            System.out.println("Student not found.");
        }
    }
    public void updateStudent(String id, String newName, double newScore) {
        Student s = studentMap.get(id);
        if (s != null) {
            s.setFullName(newName);
            s.setMarks(newScore); // use setMarks()
            System.out.println("Student updated.");
        } else {
            System.out.println("Student not found.");
        }
    }
    public void displayAllStudents() {
        for (Student s : students) {
            System.out.println(s);
        }
    }
    public void sortStudentsByScore() {
        students.sort((a, b) -> Double.compare(b.getMarks(), a.getMarks())); // use getMarks()
        System.out.println("Students sorted by score:");
        displayAllStudents();
    }
    public void searchStudent(String id) {
        Student s = studentMap.get(id);
        if (s != null) {
            System.out.println("Student found: " + s);
        } else {
            System.out.println("Student not found.");
        }
    }
}
    class Main {
    public static void main(String[] args) {
        ManagementStudent manager = new ManagementStudent();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Student");
            System.out.println("4. View All Students");
            System.out.println("5. Sort by Score");
            System.out.println("6. Search by ID");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            while (!sc.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number: ");
                sc.next(); // discard invalid input
            }
            choice = sc.nextInt(); sc.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Score: ");
                    double score = sc.nextDouble(); sc.nextLine();
                    manager.addStudent(new Student(id, name, score));
                    break;
                case 2:
                    System.out.print("ID to delete: ");
                    manager.deleteStudent(sc.nextLine());
                    break;
                case 3:
                    System.out.print("ID to update: ");
                    String uid = sc.nextLine();
                    System.out.print("New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("New Score: ");
                    double newScore = sc.nextDouble(); sc.nextLine();
                    manager.updateStudent(uid, newName, newScore);
                    break;
                case 4:
                    manager.displayAllStudents();
                    break;
                case 5:
                    manager.sortStudentsByScore();
                    break;
                case 6:
                    System.out.print("ID to search: ");
                    manager.searchStudent(sc.nextLine());
                    break;
                case 0:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 0);
        sc.close();
    }
}