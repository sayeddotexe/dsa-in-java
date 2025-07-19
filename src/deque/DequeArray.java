package deque;

public class DequeArray {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;



    public DequeArray(int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;

    }

    public boolean isFull(){
        return size == capacity;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void addFirst(int data) {
        if (isFull()) {
            throw new RuntimeException("Deque is full");
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity;
        }

        arr[front] = data;
        size++;
    }

    public void addLast(int data){
        if (isFull()){
            System.out.println("Deque is full");
        }

        if (isEmpty()){
            front = rear = 0;
        } else {
            rear = ( rear + 1 ) % capacity;
        }

        arr[rear] = data;
        size++;

    }

    public int removeFirst(){
        if (isEmpty()){
            return -1;
        }
        int data = arr[front];

        if (front == rear){
            front = -1;
            rear = -1;
        } else{
            front = (front + 1) % capacity;
        }
        size--;
        return data;
    }

    public int removeLast(){
        if (isEmpty()){
            return -1;
        }
        int data = arr[rear];

        if (front == rear){
            front = -1;
            rear = -1;
        } else{
            rear = (rear - 1 + capacity) % capacity;
        }
        size--;
        return data;


    }

    public int peekFirst(){
        if (isEmpty()){
            return -1;
        }
        return arr[front];
    }

    public int peekLast(){
        if (isEmpty()){
            return -1;
        }
        return arr[rear];
    }

    public void printDeque(){
        if (isEmpty()){
            System.out.println("Deque is empty");
            return;
        }
        int i = front;
        System.out.print("front <- ");
        while (i != ((rear+1) % capacity)){
            System.out.print(arr[i] + " <- ");
            i = (i+1) % capacity;
        }
        System.out.println("rear");


    }


    public static void main(String[] args){
        DequeArray deque = new DequeArray(5);

        deque.addLast(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(30);
        deque.printDeque(); // Deque: 5 10 20 30

        System.out.println("Removed First: " + deque.removeFirst()); // 5
        System.out.println("Removed Last: " + deque.removeLast());   // 30

        deque.printDeque(); // Deque: 10 20

        System.out.println("Front: " + deque.peekFirst()); // 10
        System.out.println("Rear: " + deque.peekLast());   // 20
    }
}
