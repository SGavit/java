package data_Structure;

public class BinarySearchTree {
}
/*


public class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}
public class BinarySearchTree {
    TreeNode root;

    // Insert node
    public TreeNode insert(TreeNode root, int data) {
        if (root == null) return new TreeNode(data);
        if (data < root.data)
            root.left = insert(root.left, data);
        else if (data > root.data)
            root.right = insert(root.right, data);
        return root;
    }

    // Search node
    public boolean search(TreeNode root, int key) {
        if (root == null) return false;
        if (key == root.data) return true;
        return key < root.data ? search(root.left, key) : search(root.right, key);
    }

    // Delete node
    public TreeNode delete(TreeNode root, int key) {
        if (root == null) return null;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // Node found
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Node with two children
            root.data = findMin(root.right);
            root.right = delete(root.right, root.data);
        }

        return root;
    }

    // Find minimum value (used in delete)
    private int findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    // Inorder Traversal
    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Main
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) {
            bst.root = bst.insert(bst.root, val);
        }

        System.out.print("Inorder (sorted): ");
        bst.inorder(bst.root); // Output: 20 30 40 50 60 70 80

        System.out.println("\nSearch 40: " + bst.search(bst.root, 40)); // true
        System.out.println("Search 90: " + bst.search(bst.root, 90)); // false

        bst.root = bst.delete(bst.root, 50); // delete root node
        System.out.print("Inorder after deleting 50: ");
        bst.inorder(bst.root); // Output: 20 30 40 60 70 80
    }
}
Want to add:

Level-order (BFS) traversal?

Iterative insert/search?

GUI visualization?


*/