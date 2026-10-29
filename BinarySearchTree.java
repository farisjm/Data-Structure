
class BinarySearchTree {

    class Node {
        int data;
        Node left;
        Node right;

        // Node constructor
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // Root node of the BST
    Node root;

    // Constructor: initially the tree is empty
    BinarySearchTree() {
        root = null;
    }

    // INSERTION
    void insert(int data) {
        root = insertNode(root, data);
    }

    Node insertNode(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertNode(root.left, data);
        } else if (data > root.data) {
            root.right = insertNode(root.right, data);
        }

        // Duplicate values are not inserted
        return root;
    }

    // DELETION
    void delete(int data) {
        root = deleteNode(root, data);
    }

    Node deleteNode(Node root, int data) {

        // If tree is empty or value is not found
        if (root == null) {
            return root;
        }

        if (data < root.data) {
            root.left = deleteNode(root.left, data);
        } else if (data > root.data) {
            root.right = deleteNode(root.right, data);
        } else {

            // Case 1: Node has no left child
            if (root.left == null) {
                return root.right;
            }

            // Case 2: Node has no right child
            if (root.right == null) {
                return root.left;
            }

            // Case 3: Node has two children
            // Find the inorder successor
            root.data = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteNode(root.right, root.data);
        }

        return root;
    }

    // Find the minimum value in a subtree
    int minValue(Node root) {
        int min = root.data;

        while (root.left != null) {
            root = root.left;
            min = root.data;
        }

        return min;
    }

    // INORDER TRAVERSAL
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("BST after insertion:");
        tree.inorder(tree.root);

        tree.delete(20);
        System.out.println("\n\nAfter deleting 20:");
        tree.inorder(tree.root);

        tree.delete(50);
        System.out.println("\n\nAfter deleting 50:");
        tree.inorder(tree.root);

        tree.delete(70);
        System.out.println("\n\nAfter deleting 70:");
        tree.inorder(tree.root);
    }
}
