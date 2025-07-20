package heaps;

public class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    private int parent(int i) { return (i - 1) / 2; }
    private int leftChild(int i) { return 2 * i + 1; }
    private int rightChild(int i) { return 2 * i + 2; }

    public void insert(int val) {
        if (size == capacity) throw new RuntimeException("Heap is full");

        heap[size] = val;
        size++;

        // Heapify up
        int current = size - 1;
        while (current > 0 && heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public int extractMin() {
        if (size == 0) throw new RuntimeException("Heap is empty");
        int root = heap[0];

        heap[0] = heap[size - 1];
        size--;
        heapify(0);

        return root;
    }

    private void heapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int smallest = i;

        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }
        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }
        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public int peek() {
        if (size == 0) throw new RuntimeException("Heap is empty");
        return heap[0];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printHeap() {
        System.out.print("Heap: ");
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        MinHeap minHeap = new MinHeap(10);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(8);
        minHeap.printHeap();
        System.out.println("Min heap extract: " + minHeap.extractMin()); // 3
    }
}