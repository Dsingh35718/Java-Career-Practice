import java.util.ArrayList;

public class StudentManager {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(
            new Student("Darshdeep", 22, 3.76, "Computer Science")
        );

        students.add(
            new Student("Alex", 21, 3.50, "Computer Science")
        );

        students.add(
            new Student("Sarah", 23, 3.90, "Information Technology")
        );

        System.out.println("Total Students: " + students.size());
        System.out.println();

        for (Student student : students) {

            student.displayStudent();

            System.out.println("--------------------");
        }
    }
}