package queue;

public class QueueLinkedList {
    private Node front;
    private Node rear;

    class Node{
        int data;
        Node next;

        Node(int value){
            this.data = value;
            this.next = null;
        }
    }

    public void enqueue(int value){
        Node newNode = new Node(value);

        if (rear  == null ){
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue(){
        if (front == null){
            System.out.println("Stack underflow");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front == null){
            rear = null;
        }
        return value;
    }

    public void printQueue(){
        Node current = front;
        System.out.println("Printed Queue");

        while (current !=null){
            System.out.print(current.data + " <- ");
            current = current.next;
        }
        System.out.println("rear");
    }

    public int peek(){
        if (front == null){
            System.out.println("null");
            return -1;
        }

        return front.data;
    }

    public boolean isEmpty(){
        return (front == null);
    }


    public static void main(String[] args){
        QueueLinkedList queue = new QueueLinkedList();
        queue.enqueue(5);
        queue.enqueue(15);
        queue.enqueue(25);
        queue.printQueue(); // Output: Queue: 5 15 25

        System.out.println("Dequeued: " + queue.dequeue()); // 5
        queue.printQueue(); // Queue: 15 25

        System.out.println("Peek: " + queue.peek()); // 15

        System.out.println("isEmpty: " + queue.isEmpty()); // false



    }
}
