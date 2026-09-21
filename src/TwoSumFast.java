import java.util.HashMap;

public class TwoSumFast {

    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            int needed = target - numbers[i];

            if (seen.containsKey(needed)) {

                int firstIndex = seen.get(needed);

                System.out.println(
                    "Indexes: " + firstIndex + ", " + i
                );

                System.out.println(
                    "Numbers: " + needed
                    + " + " + numbers[i]
                    + " = " + target
                );

                return;
            }

            seen.put(numbers[i], i);
        }

        System.out.println("No solution found.");
    }
}