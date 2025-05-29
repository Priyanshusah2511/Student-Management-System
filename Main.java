import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Student Record Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter CGPA: ");
                    double cgpa = sc.nextDouble();
                    sc.nextLine();
                    manager.addStudent(new Student(id, name, age, dept, cgpa));
                    break;

                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    id = sc.nextLine();
                    Student found = manager.searchStudent(id);
                    if (found != null) System.out.println(found);
                    else System.out.println("Student not found.");
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");
                    id = sc.nextLine();
                    System.out.print("Enter New Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter New Age: ");
                    age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Department: ");
                    dept = sc.nextLine();
                    System.out.print("Enter New CGPA: ");
                    cgpa = sc.nextDouble();
                    sc.nextLine();
                    boolean updated = manager.updateStudent(id, new Student(id, name, age, dept, cgpa));
                    System.out.println(updated ? "Record updated." : "Student not found.");
                    break;

                case 5:
                    System.out.print("Enter ID to delete: ");
                    id = sc.nextLine();
                    boolean deleted = manager.deleteStudent(id);
                    System.out.println(deleted ? "Record deleted." : "Student not found.");
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);

        sc.close();
    }
}

