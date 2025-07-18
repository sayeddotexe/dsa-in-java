import arrays.ArrayBasics;
import arrays.DoublyLinkedList;
import arrays.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayBasics.demo();
        System.out.println(" ");
        System.out.println("Singly Linked List:");

        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtHead(30);
        list.insertAtHead(20);
        list.insertAtTail(40);
        list.insertAtHead(10);

        list.printList(); // 10 -> 20 -> 30 -> 40 -> null

        list.reverse();
        list.printList(); // 40 -> 30 -> 20 -> 10 -> null

        System.out.println("Middle: " + list.findMiddle()); // 30
        System.out.println("Search 20: " + list.search(20)); // true

        list.deleteByValue(30);
        list.printList(); // 40 -> 20 -> 10 -> null

        System.out.println(" ");
        System.out.println("Doubly Linked List:");
        DoublyLinkedList dList = new DoublyLinkedList();

        dList.insertAtHead(10);
        dList.insertAtHead(20);
        dList.insertAtHead(30);

        dList.insertAtTail(5);

        dList.printListForward();
        dList.printListBackward();

        /* Need to make class & feilds in Doubly linked list public
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtHead(10); // node3
        dll.insertAtHead(20); // node2
        dll.insertAtHead(30); // node1

        // Access nodes to create cycle: 10 -> 30
        DoublyLinkedList.Node node1 = dll.head;               // 30
        DoublyLinkedList.Node node2 = node1.next;            // 20
        DoublyLinkedList.Node node3 = node2.next;            // 10

        node3.next = node1; // cycle: 10 -> 30

        if (dll.hasCycle()) {
            System.out.println("Cycle found");
        } else {
            System.out.println("No cycle found");
        }

         */

        System.out.println(" ");
    }

}