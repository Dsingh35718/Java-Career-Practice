import java.util.HashSet;

public class FindDuplicates {

    public static void main(String[] args) {

        int[] numbers = {4, 2, 7, 4, 9, 2};

        HashSet<Integer> seen = new HashSet<>();

        for (int number : numbers) {

            if (seen.contains(number)) {
                System.out.println("Duplicate: " + number);
            } else {
                seen.add(number);
            }
        }
    }
}