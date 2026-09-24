import java.util.Stack;

public class ValidParentheses {

    // Method to check if parentheses are valid
    public static boolean isValid(String input) {

        Stack<Character> stack = new Stack<>();

        // Check every character
        for (char ch : input.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {

                // No opening bracket available
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check matching brackets
                if (ch == ')' && top != '(') {
                    return false;
                }

                if (ch == '}' && top != '{') {
                    return false;
                }

                if (ch == ']' && top != '[') {
                    return false;
                }
            }
        }

        // Stack must be empty if everything matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String input1 = "({[]})";
        String input2 = "([)]";
        String input3 = "{[()]}";
        String input4 = "(((";

        System.out.println(input1 + " -> " + isValid(input1));
        System.out.println(input2 + " -> " + isValid(input2));
        System.out.println(input3 + " -> " + isValid(input3));
        System.out.println(input4 + " -> " + isValid(input4));
    }
}