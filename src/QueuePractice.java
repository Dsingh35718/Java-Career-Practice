import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {

    public static void main(String[] args) {

        Queue<String> customers = new LinkedList<>();

        customers.offer("Darshdeep");
        customers.offer("Alex");
        customers.offer("Sarah");

        System.out.println("Queue: " + customers);

        System.out.println(
            "Next Customer: " + customers.peek()
        );

        String servedCustomer = customers.poll();

        System.out.println(
            "Serving: " + servedCustomer
        );

        System.out.println(
            "Next Customer: " + customers.peek()
        );
    }
}