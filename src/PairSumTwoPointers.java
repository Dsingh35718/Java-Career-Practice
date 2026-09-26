public class PairSumTwoPointers {

    // Find two numbers whose sum equals the target
    public static boolean findPair(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                System.out.println(
                    "Pair found: " + numbers[left] + " + "
                    + numbers[right] + " = " + target
                );

                return true;
            }

            // Sum is too small
            if (sum < target) {
                left++;
            }

            // Sum is too large
            else {
                right--;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // Array must be sorted
        int[] numbers = {1, 2, 3, 4, 6};

        int target = 6;

        boolean found = findPair(numbers, target);

        if (!found) {
            System.out.println("No pair found.");
        }
    }
}