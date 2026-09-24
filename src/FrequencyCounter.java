import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {

    public static void main(String[] args) {

        // Array of numbers
        int[] numbers = {1, 2, 2, 3, 1, 1, 4};

        // HashMap to store number -> frequency
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each number
        for (int number : numbers) {

            if (frequencyMap.containsKey(number)) {
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            } else {
                frequencyMap.put(number, 1);
            }
        }

        // Display the frequencies
        System.out.println("Number Frequencies:");

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {

            System.out.println(
                entry.getKey() + " -> " + entry.getValue() + " times"
            );
        }
    }
}