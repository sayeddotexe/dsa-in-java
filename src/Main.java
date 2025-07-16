import arrays.ArrayBasics;
import arrays.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayBasics.demo();

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
    }
}