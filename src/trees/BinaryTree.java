package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int value){
            this.data = value;
            this.left = null;
            this.right = null;
        }
    }

    //Preorder (and inorder, postorder) are all types of DFS (Depth-First Search) traversals.

    // In-order Traversal (Left, Root, Right) *(DFS)
    public void inorder(Node node) {
        if (node == null) return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }


    // Pre-order Traversal (Root, Left, Right) *(DFS)
    public void preorder(Node node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        inorder(node.left);
        inorder(node.right);

    }

    // Post-order Traversal *(DFS)
    public void postorder(Node node) {
        if (node == null) return;

        inorder(node.left);
        inorder(node.right);
        System.out.print(node.data + " ");

    }

    // BFS Traversal
    // BFS always use Queue - to process level by level
    // DFS always use stack (either explicit or recursion) - to go deep before backtracking
    public void BFS(Node node) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }

    }




    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();

        // Creating a simple binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.print("Inorder: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.print("Preorder: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.print("Postorder: ");
        tree.postorder(tree.root);
        System.out.println();

        System.out.print("BFS: ");
        tree.BFS(tree.root);
        System.out.println();

    }
}
