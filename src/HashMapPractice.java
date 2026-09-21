import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {

        // HashMap for student names
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Darshdeep");
        students.put(102, "Alex");
        students.put(103, "Sarah");

        // HashMap for student GPAs
        HashMap<Integer, Double> gpas = new HashMap<>();

        gpas.put(101, 3.76);
        gpas.put(102, 3.50);
        gpas.put(103, 3.90);

        // Display all students
        System.out.println("Students: " + students);
        System.out.println("Total Students: " + students.size());

        System.out.println();

        // Display Darshdeep
        System.out.println("Student: " + students.get(101));
        System.out.println("GPA: " + gpas.get(101));

        System.out.println();

        // Display Sarah
        System.out.println("Student: " + students.get(103));
        System.out.println("GPA: " + gpas.get(103));

        System.out.println();

        // Check if student ID 103 exists
        if (students.containsKey(103)) {
            System.out.println("Student 103 exists.");
        }
    }
}