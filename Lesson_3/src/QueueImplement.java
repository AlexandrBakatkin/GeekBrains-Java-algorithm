public class QueueImplement implements QueueInterface {

    private int data[];
    private int size = 0;
    private int front = 0;
    private int rear = -1;

    public QueueImplement(int maxSize) {
        this.data = new int[maxSize];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    @Override
    public boolean insert(int value) {
        if (!isFull()){
            if (rear == data.length - 1){
                rear = -1;
            }
            data[++rear] = value;
            size++;
            return true;
        } else return false;
    }

    @Override
    public int remove() {
        int value;
        if (!isEmpty()) {
            value = data[front++];
            if (front == data.length){
                front = 0;
            }
            size--;
            return value;
        }
        return -1;
    }

    @Override
    public int peek() {
        return data[front];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void displayQueue() {
        int currentSize = size;
        int currentFront = front;
        while (currentSize > 0) {
            System.out.println(data[currentFront++]);
            if (front == data.length) {
                currentFront = 0;
            }
            currentSize--;
        }
    }
}
