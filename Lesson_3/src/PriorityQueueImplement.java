public class PriorityQueueImplement implements QueueInterface {

    private int data[];
    private int size;

    public PriorityQueueImplement(int maxSize) {
        this.data = new int [maxSize];
        this.size = 0;
    }

    @Override
    public boolean insert(int value) {
        int index = 0;
        if (!isFull()){
            if (isEmpty()) {
                data[size++] = value;
                return true;
            }
            else {
                for (index = size - 1; index >= 0; index--) {
                    if (value > data[index]) {
                        data[index + 1] = data[index];
                    }
                    else {
                        break;
                    }
                }
                data[index + 1] = value;
                size++;
                return true;
            }
        }
        return false;
    }

    @Override
    public int remove() {
        return data[--size];
    }

    @Override
    public int peek() {
        return data[size-1];
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
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(data[i] + "|");
        }
    }
}
