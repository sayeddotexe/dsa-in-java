package arrays;

public class SinglyLinkedList {
    // -----------------------
    // NODE CLASS DEFINITION
    // -----------------------

    // Static because it doesn't need access to outer SinglyLinkedList instance.
    // This makes it easier to create nodes independently.
    static class Node {
        int data;       // Holds the value of the node
        Node next;      // Points to the next node in the list

        // Constructor to initialize node with data
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // -----------------------
    // LINKED LIST PROPERTIES
    // -----------------------

    // Head of the linked list
    // Not static because each SinglyLinkedList object should have its own head
    private Node head;

    // Public: we want to allow access from outside the class (e.g., Main)
    public void insertAtHead(int data) {
        Node newNode = new Node(data);   // Create a new node
        newNode.next = head;             // Point it to current head
        head = newNode;                  // Move head to new node


    }

    public void insertAtTail(int data){
        Node newNode = new Node(data);   // Create a new node

        if (head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    // -----------------------
    // DELETE OPERATION
    // -----------------------

    public void deleteByValue(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;    // Remove the head
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;  // Bypass the node to delete it
        }
    }

    // -----------------------
    // SEARCH OPERATION
    // -----------------------

    public boolean search(int value) {
        Node current = head;

        while (current != null) {
            if (current.data == value) return true;
            current = current.next;
        }

        return false;
    }


    // -----------------------
    // PRINT THE LIST
    // -----------------------

    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    // -----------------------
    // REVERSE THE LIST
    // -----------------------

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;     // Save next node
            current.next = prev;     // Reverse pointer
            prev = current;          // Move prev forward
            current = next;          // Move current forward
        }

        head = prev; // Update head to new first node
    }

    // -----------------------
    // FIND MIDDLE NODE
    // -----------------------

    public int findMiddle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;            // Move one step
            fast = fast.next.next;       // Move two steps
        }

        return slow != null ? slow.data : -1;
    }

    // -----------------------
    // CYCLE DETECTION (Floyd's Algorithm)
    // -----------------------

    public boolean hasCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;            // Move one step
            fast = fast.next.next;       // Move two steps

            if (slow == fast) return true;   // Cycle detected
        }

        return false;
    }
}