import java.util.Stack;

public class StackPractice {

    public static void main(String[] args) {

        Stack<String> browserHistory = new Stack<>();

        browserHistory.push("Google");
        browserHistory.push("YouTube");
        browserHistory.push("GitHub");

        System.out.println("Stack: " + browserHistory);

        System.out.println(
            "Current Page: " + browserHistory.peek()
        );

        String removedPage = browserHistory.pop();

        System.out.println(
            "Going back from: " + removedPage
        );

        System.out.println(
            "Current Page: " + browserHistory.peek()
        );
    }
}