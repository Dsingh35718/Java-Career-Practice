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

    // Insert a value into the BST
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

    // Inorder traversal: Left -> Root -> Right
    public static void inorder(Node root) {

        if (root != null) {
            inorder(root.left);

            System.out.print(root.value + " ");

            inorder(root.right);
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

        System.out.println("Binary Search Tree:");

        inorder(root);

        System.out.println();

        // Search examples
        System.out.println("Search for 60: " + search(root, 60));
        System.out.println("Search for 100: " + search(root, 100));
    }
}