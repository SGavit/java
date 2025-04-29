package data_Structure;

import java.util.ArrayList;
import java.util.List;

class TreeNode<T>{
    T data;
    List<TreeNode<T>> children;
    public TreeNode(T data)
    {
      this.data = data;
      this.children = new ArrayList<>();
    }
    public void addChild(TreeNode<T> child)
    {
        children.add(child);
    }

}

public class TreeExample {
    public static void main(String[] args) {
        TreeNode<String> root = new TreeNode<>("Root");
        TreeNode<String> child1 = new TreeNode<>("child 1");
        TreeNode<String> child2 = new TreeNode<>("Child 2");
        root.addChild(child1);
        root.addChild(child2);
        printTree(root," ");
    }
    public static void printTree(TreeNode<?> node,String indent){
        System.out.println(indent + node.data);
        for(TreeNode<?> child: node.children){
            printTree(child,indent+" ");
        }
    }
}


/* without generic

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    String data;
    List<TreeNode> children;

    public TreeNode(String data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode child) {
        children.add(child);
    }
}

public class TreeExample {
    public static void main(String[] args) {
        TreeNode root = new TreeNode("Root");
        TreeNode child1 = new TreeNode("Child 1");
        TreeNode child2 = new TreeNode("Child 2");

        root.addChild(child1);
        root.addChild(child2);

        printTree(root, " ");
    }

    public static void printTree(TreeNode node, String indent) {
        System.out.println(indent + node.data);
        for (TreeNode child : node.children) {
            printTree(child, indent + "  ");
        }
    }
}



*  */