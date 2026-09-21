public class LinearSearch {

    public static void main(String[] args) {

        int[] numbers = {12, 7, 25, 9, 30, 18};
        int target = 30;

        int index = linearSearch(numbers, target);

        if (index != -1) {
            System.out.println("Target found!");
            System.out.println("Index: " + index);
        } else {
            System.out.println("Target not found.");
        }
    }

    public static int linearSearch(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == target) {
                return i;
            }
        }

        return -1;
    }
}