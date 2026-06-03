import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = input.nextInt();

                input.nextLine(); // clear buffer

                System.out.print("Enter Name: ");
                String name = input.nextLine();

                System.out.print("Enter Age: ");
                int age = input.nextInt();

                Student s = new Student(id, name, age);
                manager.addStudent(s);

                System.out.println("Student added!");

            } else if (choice == 2) {
                manager.displayAllStudents();

            } else if (choice == 3) {
                System.out.print("Enter ID to search: ");
                int id = input.nextInt();

                manager.searchStudent(id);

            } else if (choice == 4) {
                System.out.println("Goodbye!");
                break;

            } else {
                System.out.println("Invalid option.");
            }
        }

        input.close();
    }
}
