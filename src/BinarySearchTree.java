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

        // Inorder traversal
        System.out.println("Inorder Traversal:");
        inorder(root);

        // Preorder traversal
        System.out.println("\nPreorder Traversal:");
        preorder(root);

        // Postorder traversal
        System.out.println("\nPostorder Traversal:");
        postorder(root);

        // Search examples
        System.out.println("\nSearch for 60: " + search(root, 60));
        System.out.println("Search for 100: " + search(root, 100));
    }
}