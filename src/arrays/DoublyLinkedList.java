package arrays;

public class DoublyLinkedList {
    Node head;

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void insertAtTail(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
        }

        Node current = head;

        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    public void printListForward() {
        System.out.println("Print list forward");
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void printListBackward(){
        System.out.println("Print list backward");
        if (head == null){
            return;
        }
        Node current = head;

        while (current.next != null){
            current = current.next;
        }

        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    public boolean hasCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Cycle detected
            }
        }

        return false; // No cycle
    }


}