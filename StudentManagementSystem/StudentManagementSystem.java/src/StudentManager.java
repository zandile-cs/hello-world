import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            s.displayStudent();
        }
    }

    public void searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Student found:");
                s.displayStudent();
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
