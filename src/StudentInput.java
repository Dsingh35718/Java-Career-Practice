import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            System.out.print("Enter GPA: ");
            double gpa = scanner.nextDouble();

            if (gpa < 0.0 || gpa > 4.0) {
                System.out.println(
                    "Error: GPA must be between 0.0 and 4.0."
                );
            } else {
                System.out.println();
                System.out.println("Student Information");
                System.out.println("-------------------");
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("GPA: " + gpa);
            }

        } catch (InputMismatchException e) {

            System.out.println();
            System.out.println(
                "Error: Please enter numbers for age and GPA."
            );

        } finally {

            scanner.close();
        }
    }
}