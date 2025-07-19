package deque;

public class DequeLinkedList {
    private Node front;
    private Node rear;
    private int size;

    public class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;

        }
    }

    public void addFirst(int value){
        Node newNode = new Node(value);

        if (front ==  null){
            front = rear = newNode;
        } else{
        newNode.next = front;
        front.prev = newNode;
        front = newNode;
        }
        size++;

    }

    public void addLast(int value){
        Node newNode = new Node(value);

        if (front ==  null){
            front = rear = newNode;
        } else{
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        size++;
    }

    public int removeFirst() {
        if (front == null) {
            return -1; // or throw exception
        }

        int data = front.data;
        front = front.next;

        if (front != null) {
            front.prev = null;
        } else {
            rear = null; // deque is now empty
        }

        return data;
    }

    public int removeLast() {
        if (rear == null) {
            return -1; // or throw exception
        }

        int data = rear.data;
        rear = rear.prev;

        if (rear != null) {
            rear.next = null;
        } else {
            front = null; // deque is now empty
        }

        return data;
    }

    public int peekFirst(){
        if(front == null){
            return -1;
        }
        return front.data;
    }

    public int peekLast(){
        if(rear == null){
            return -1;
        }
        return rear.data;
    }

    public void printDeque(){

        if (front == null){
            System.out.println("Stack underflow");
            return;
        }

        Node current = front;

        System.out.print("front <- ");

        while(current != null){
            System.out.print(current.data + " <- ");
            current = current.next;
        }
        System.out.println("rear");
    }

    public int size(){
        return size;
    }



    public static void main(String[] args){
        DequeLinkedList deque = new DequeLinkedList();

        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(25);

        deque.printDeque();

        System.out.println("Front: " + deque.peekFirst()); // 5
        System.out.println("Rear: " + deque.peekLast());   // 25

        System.out.println("Removed Front: " + deque.removeFirst()); // 5
        System.out.println("Removed Rear: " + deque.removeLast());   // 25

        deque.printDeque();

        System.out.println("Front now: " + deque.peekFirst()); // 10
        System.out.println("Rear now: " + deque.peekLast());   // 20
        System.out.println("Size: " + deque.size());           // 2
    }
}
