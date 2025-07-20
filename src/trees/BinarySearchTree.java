package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
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

    public Node insert(Node root, int value){

        if (root == null){
            return new Node(value);
        }
        if (value < root.data){
            root.left = insert(root.left,value);
        } else if (value > root.data){
            root.right = insert(root.right,value);
        }


        return root;

    }

    // Search in BST
    public boolean search(Node root, int key) {
        if (root == null) return false;
        if (key == root.data) return true;
        else if (key < root.data) return search(root.left, key);
        else return search(root.right, key);
    }

    // Inorder traversal (Left - Root - Right)
    public void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Preorder traversal (Root - Left - Right)
    public void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder traversal (Left - Right - Root)
    public void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // BFS always use Queue - to process level by level
    // DFS always use stack (either explicit or recursion) - to go deep before backtracking
    public void bfs(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        System.out.print("BFS (Level Order): ");
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null)
                queue.add(current.left);
            if (current.right != null)
                queue.add(current.right);
        }
        System.out.println();
    }

    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = bst.insert(bst.root, 50);
        bst.insert(bst.root, 30);
        bst.insert(bst.root, 70);
        bst.insert(bst.root, 20);
        bst.insert(bst.root, 40);
        bst.insert(bst.root, 60);
        bst.insert(bst.root, 80);

        System.out.print("Inorder (DFS): ");
        bst.inorder(bst.root); // Sorted order
        System.out.println();

        System.out.print("Preorder: ");
        bst.preorder(bst.root);
        System.out.println();

        System.out.print("Postorder: ");
        bst.postorder(bst.root);
        System.out.println();

        System.out.println("Search 60: " + bst.search(bst.root, 60)); // true
        System.out.println("Search 100: " + bst.search(bst.root, 100)); // false

        bst.bfs(bst.root);
    }
}
