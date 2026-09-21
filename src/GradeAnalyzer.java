public class GradeAnalyzer {

    public static void main(String[] args) {

        int[] grades = {90, 85, 95, 88, 76};

        double average = calculateAverage(grades);
        int highest = findHighest(grades);
        int lowest = findLowest(grades);

        System.out.println("Average: " + average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);

        if (average >= 90) {
            System.out.println("Overall Grade: A");
        } else if (average >= 80) {
            System.out.println("Overall Grade: B");
        } else if (average >= 70) {
            System.out.println("Overall Grade: C");
        } else if (average >= 60) {
            System.out.println("Overall Grade: D");
        } else {
            System.out.println("Overall Grade: F");
        }
    }

    public static double calculateAverage(int[] grades) {

        int total = 0;

        for (int grade : grades) {
            total += grade;
        }

        return (double) total / grades.length;
    }

    public static int findHighest(int[] grades) {

        int highest = grades[0];

        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }

        return highest;
    }

    public static int findLowest(int[] grades) {

        int lowest = grades[0];

        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }

        return lowest;
    }
}