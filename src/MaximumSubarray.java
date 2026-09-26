public class MaximumSubarray {

    // Find the maximum sum of a contiguous subarray
    public static int maxSubarraySum(int[] numbers) {

        int currentSum = numbers[0];
        int maxSum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            // Either start a new subarray here
            // or continue the previous subarray
            currentSum = Math.max(
                numbers[i],
                currentSum + numbers[i]
            );

            // Update the maximum sum found
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] numbers = {
            -2, 1, -3, 4, -1, 2, 1, -5, 4
        };

        int result = maxSubarraySum(numbers);

        System.out.println("Maximum subarray sum: " + result);
    }
}