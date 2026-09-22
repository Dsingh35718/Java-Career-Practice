public class QuickSort {

    public static void main(String[] args) {

        int[] numbers = {10, 7, 8, 9, 1, 5};

        System.out.println("Before sorting:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Sort the array
        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("\nAfter sorting:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void quickSort(int[] array, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(array, low, high);

            // Sort left side of pivot
            quickSort(array, low, pivotIndex - 1);

            // Sort right side of pivot
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {

        // Choose last element as pivot
        int pivot = array[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (array[j] < pivot) {

                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Put pivot in its correct position
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}