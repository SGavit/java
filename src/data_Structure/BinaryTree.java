package data_Structure;
class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BinaryTree {
    Node root;
    public BinaryTree(){
        root = null;
    }
    //Inorder Traversal (left,root,right)
    public void inorder(Node node)
    {
        if(node !=null){
            inorder(node.left);
            System.out.print(node.data+" ");
            inorder(node.right);
        }
    }
    // Preorder Traversal (Root, Left, Right)
    public void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }
    // Postorder Traversal (Left, Right, Root)
    public void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.print("Inorder: ");
        tree.inorder(tree.root); // Output: 4 2 5 1 3

        System.out.print("\nPreorder: ");
        tree.preorder(tree.root); // Output: 1 2 4 5 3

        System.out.print("\nPostorder: ");
        tree.postorder(tree.root); // Output: 4 5 2 3 1

    }

}
