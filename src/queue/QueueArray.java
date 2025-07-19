package queue;

public class QueueArray {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public QueueArray(int capacity){
        this.capacity = capacity;
        queue = new int[capacity];
        front = size = 0;
        rear = -1;
    }

    public void enqueue(int value){

        if (size == capacity){
            System.out.println("Queue overflow");
            return;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;

    }

    public int dequeue(){
        if (isEmpty()) {
            System.out.println("Queue underflow");
            return -1;
        }
        int val = queue[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    public void printQueue() {
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " <- ");
        }
        System.out.println("rear");
    }

    public int peek(){
        if (isEmpty()){
            return -1;
        }
        return queue[front];

    }

    public boolean isEmpty(){
        return size == 0;
    }


    public static void main(String[] args){
        QueueArray queue = new QueueArray(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.printQueue(); // Output: Queue: 10 20 30

        System.out.println("Dequeued: " + queue.dequeue()); // 10
        queue.printQueue(); // Queue: 20 30

        System.out.println("Peek: " + queue.peek()); // 20

    }
}
