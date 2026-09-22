public class MergeSort {

    public static void main(String[] args) {

        int[] numbers = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Before sorting:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Sort the array
        mergeSort(numbers);

        System.out.println("\nAfter sorting:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void mergeSort(int[] array) {

        // Base case
        if (array.length <= 1) {
            return;
        }

        int middle = array.length / 2;

        int[] left = new int[middle];
        int[] right = new int[array.length - middle];

        // Copy values into left array
        for (int i = 0; i < middle; i++) {
            left[i] = array[i];
        }

        // Copy values into right array
        for (int i = middle; i < array.length; i++) {
            right[i - middle] = array[i];
        }

        // Recursive calls
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted arrays
        merge(array, left, right);
    }

    public static void merge(int[] array, int[] left, int[] right) {

        int i = 0;
        int j = 0;
        int k = 0;

        // Compare values from left and right
        while (i < left.length && j < right.length) {

            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }

            k++;
        }

        // Copy remaining values from left
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining values from right
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }
}