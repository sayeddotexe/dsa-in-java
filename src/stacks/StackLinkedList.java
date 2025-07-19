package stacks;

public class StackLinkedList {
    private Node top;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    public int peek() {
        return isEmpty() ? -1 : top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        Node current = top;
        System.out.print("Stack (top → bottom): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        // Test Stack using Linked List
        System.out.println("\nTest Stack using linkedlist");
        StackLinkedList linkedListStack = new StackLinkedList();
        linkedListStack.push(5);
        linkedListStack.push(15);
        linkedListStack.push(25);
        linkedListStack.printStack();  // Output: 25 15 5
        linkedListStack.pop();
        linkedListStack.printStack();  // Output: 15 5
    }
}
