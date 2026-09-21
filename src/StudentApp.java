public class StudentApp {

    public static void main(String[] args) {

        Student student1 =
                new Student("Darshdeep", 22, 3.76, "Computer Science");

        Student student2 =
                new Student("Alex", 21, 3.50, "Computer Science");

        Student student3 =
                new Student("Sarah", 23, 3.90, "Information Technology");

        student1.displayStudent();

        System.out.println();

        student2.displayStudent();

        System.out.println();

        student3.displayStudent();
    }
}