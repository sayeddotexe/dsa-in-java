package trees;

import java.util.TreeSet;

public class AVLTree {

    public static void main(String[] args){
        // AVL tree
        // self-balancing Binary Search Tree (BST) where the difference in height (called the balance factor)
        // between the left and right subtrees of every node is at most 1.

        // Tree set:
        // Sorted set (no duplicates)
        // Maintains natural ascending order (or a custom comparator)
        // Backed by a Red-Black Tree
        // self-balancing
        TreeSet<Integer> avlLikeSet = new TreeSet<>();

        avlLikeSet.add(30);
        avlLikeSet.add(10);
        avlLikeSet.add(20);
        avlLikeSet.add(40);

        System.out.println("In-order traversal: " + avlLikeSet);
        System.out.println("Contains 20? " + avlLikeSet.contains(20));
    }
}
