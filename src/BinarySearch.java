public class BinarySearch {

    public static void main(String[] args) {

        int[] numbers = {7, 9, 12, 18, 25, 30};

        int target = 100;

        int index = binarySearch(numbers, target);

        if (index != -1) {
            System.out.println("Target found!");
            System.out.println("Index: " + index);
        } else {
            System.out.println("Target not found.");
        }
    }

    public static int binarySearch(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {

            int middle = left + (right - left) / 2;

            if (numbers[middle] == target) {
                return middle;
            }

            if (numbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }
}