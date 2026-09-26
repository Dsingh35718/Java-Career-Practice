import java.util.Stack;

public class ReverseStringStack {

    // Method to reverse a String using a Stack
    public static String reverseString(String input) {

        Stack<Character> stack = new Stack<>();

        // Push every character onto the stack
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        // Build the reversed String
        StringBuilder reversed = new StringBuilder();

        // Pop characters from the stack
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {

        String original = "Darshdeep";

        String reversed = reverseString(original);

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}