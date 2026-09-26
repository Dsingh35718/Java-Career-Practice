public class PrefixSum {

    // Build the prefix sum array
    public static int[] buildPrefixSum(int[] numbers) {

        int[] prefix = new int[numbers.length];

        prefix[0] = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        return prefix;
    }

    // Find the sum from index left to right
    public static int rangeSum(int[] prefix, int left, int right) {

        if (left == 0) {
            return prefix[right];
        }

        return prefix[right] - prefix[left - 1];
    }

    public static void main(String[] args) {

        int[] numbers = {2, 4, 1, 5, 3};

        int[] prefix = buildPrefixSum(numbers);

        System.out.println("Prefix Sum Array:");

        for (int number : prefix) {
            System.out.print(number + " ");
        }

        int left = 1;
        int right = 3;

        int result = rangeSum(prefix, left, right);

        System.out.println();
        System.out.println(
            "Sum from index " + left + " to " + right + ": " + result
        );
    }
}