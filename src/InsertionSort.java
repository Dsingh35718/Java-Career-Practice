public class InsertionSort {

    public static void main(String[] args) {

        int[] numbers = {9, 5, 1, 4, 3};

        System.out.println("Before sorting:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        for (int i = 1; i < numbers.length; i++) {

            int key = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            numbers[j + 1] = key;
        }

        System.out.println("\nAfter sorting:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}