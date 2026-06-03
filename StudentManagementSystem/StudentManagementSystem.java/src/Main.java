import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Student");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = input.nextInt();

                    input.nextLine();

                    System.out.print("Enter Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Age: ");
                    int age = input.nextInt();

                    if (age <= 0) {
                        System.out.println("Age must be positive.");
                        break;
                    }

                    Student student = new Student(id, name, age);
                    manager.addStudent(student);

                    System.out.println("Student added successfully.");
                    break;

                case 2:

                    manager.displayAllStudents();
                    break;

                case 3:

                    System.out.print("Enter Student ID: ");
                    int searchId = input.nextInt();

                    manager.searchStudent(searchId);
                    break;

                case 4:

                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = input.nextInt();

                    manager.deleteStudent(deleteId);
                    break;

                case 5:

                    System.out.print("Enter Student ID to update: ");
                    int updateId = input.nextInt();

                    input.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = input.nextLine();

                    System.out.print("Enter new age: ");
                    int newAge = input.nextInt();

                    if (newAge <= 0) {
                        System.out.println("Age must be positive.");
                        break;
                    }

                    manager.updateStudent(updateId, newName, newAge);
                    break;

                case 6:

                    System.out.println("Thank you for using the Student Management System.");
                    input.close();
                    return;

                default:

                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
