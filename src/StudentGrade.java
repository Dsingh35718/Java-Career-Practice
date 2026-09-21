public class StudentGrade {

    public static void main(String[] args) {

        String name = "Darshdeep";
        int[] grades = {90, 85, 95, 88};

        int total = 0;

        for (int grade : grades) {
            total += grade;
        }

        double average = (double) total / grades.length;

        System.out.println("Student: " + name);
        System.out.println("Average: " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 80) {
            System.out.println("Grade: B");
        } else if (average >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}