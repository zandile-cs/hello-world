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

    public void deleteStudent(int id) {

        for (Student s : students) {

            if (s.getId() == id) {
                students.remove(s);
                System.out.println("Student deleted successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public void updateStudent(int id,
                              String newName,
                              int newAge) {

        for (Student s : students) {

            if (s.getId() == id) {

                s.setName(newName);
                s.setAge(newAge);

                System.out.println(
                        "Student updated successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}