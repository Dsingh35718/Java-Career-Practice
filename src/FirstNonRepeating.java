import java.util.HashMap;

public class FirstNonRepeating {

    public static void main(String[] args) {

        // Array of numbers
        int[] numbers = {4, 5, 1, 2, 1, 4, 5};

        // Store number -> frequency
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count how many times each number appears
        for (int number : numbers) {

            frequencyMap.put(
                number,
                frequencyMap.getOrDefault(number, 0) + 1
            );
        }

        // Find the first number that appears only once
        int firstNonRepeating = -1;

        for (int number : numbers) {

            if (frequencyMap.get(number) == 1) {
                firstNonRepeating = number;
                break;
            }
        }

        // Display result
        if (firstNonRepeating != -1) {
            System.out.println(
                "First non-repeating number: " + firstNonRepeating
            );
        } else {
            System.out.println("No non-repeating number found.");
        }
    }
}