public class SlidingWindow {

    // Find the maximum sum of a subarray of size k
    public static int maxSumSubarray(int[] numbers, int k) {

        // Check for invalid input
        if (numbers == null || k <= 0 || k > numbers.length) {
            throw new IllegalArgumentException("Invalid window size.");
        }

        // Calculate the first window
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += numbers[i];
        }

        int maxSum = windowSum;

        // Slide the window across the array
        for (int i = k; i < numbers.length; i++) {

            // Add the new number
            windowSum += numbers[i];

            // Remove the number leaving the window
            windowSum -= numbers[i - k];

            // Update maximum
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] numbers = {2, 1, 5, 1, 3, 2};

        int k = 3;

        int result = maxSumSubarray(numbers, k);

        System.out.println("Maximum sum: " + result);
    }
}