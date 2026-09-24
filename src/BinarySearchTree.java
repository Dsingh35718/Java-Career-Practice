import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    // Node class
    static class Node {

        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    // Insert a value into the Binary Search Tree
    public static Node insert(Node root, int value) {

        if (root == null) {
            return new Node(value);
        }

        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // Inorder: Left -> Root -> Right
    public static void inorder(Node root) {

        if (root != null) {
            inorder(root.left);

            System.out.print(root.value + " ");

            inorder(root.right);
        }
    }

    // Preorder: Root -> Left -> Right
    public static void preorder(Node root) {

        if (root != null) {
            System.out.print(root.value + " ");

            preorder(root.left);

            preorder(root.right);
        }
    }

    // Postorder: Left -> Right -> Root
    public static void postorder(Node root) {

        if (root != null) {
            postorder(root.left);

            postorder(root.right);

            System.out.print(root.value + " ");
        }
    }

    // Level Order Traversal / BFS
    public static void levelOrder(Node root) {

        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            Node current = queue.remove();

            System.out.print(current.value + " ");

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    // Search for a value
    public static boolean search(Node root, int value) {

        if (root == null) {
            return false;
        }

        if (root.value == value) {
            return true;
        }

        if (value < root.value) {
            return search(root.left, value);
        } else {
            return search(root.right, value);
        }
    }

    public static void main(String[] args) {

        Node root = null;

        // Insert values
        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 60);
        root = insert(root, 80);

        // Inorder
        System.out.println("Inorder Traversal:");
        inorder(root);

        // Preorder
        System.out.println("\nPreorder Traversal:");
        preorder(root);

        // Postorder
        System.out.println("\nPostorder Traversal:");
        postorder(root);

        // BFS / Level Order
        System.out.println("\nLevel Order Traversal (BFS):");
        levelOrder(root);

        // Search
        System.out.println("\nSearch for 60: " + search(root, 60));
        System.out.println("Search for 100: " + search(root, 100));
    }
}