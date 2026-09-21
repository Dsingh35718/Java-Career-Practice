import java.util.LinkedList;

public class LinkedListPractice {

    public static void main(String[] args) {

        LinkedList<String> students = new LinkedList<>();

        students.add("Darshdeep");
        students.add("Alex");
        students.add("Sarah");

        System.out.println("Students: " + students);

        students.addFirst("John");
        students.addLast("Mike");

        System.out.println("After adding: " + students);

        students.removeFirst();

        System.out.println("After removing first: " + students);

        System.out.println("First: " + students.getFirst());
        System.out.println("Last: " + students.getLast());
    }
}