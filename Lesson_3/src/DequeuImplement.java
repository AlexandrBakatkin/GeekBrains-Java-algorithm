public class DequeuImplement implements DequeuInterface {

    private int data[];
    private int size = 0;
    private int front = 0;
    private int rear = -1;

    public DequeuImplement(int maxSize) {
        this.data = new int[maxSize];
        this.size = 0;
        this.front = -1;
        this.rear = 0;
    }

    @Override
    public boolean insertRear(int value) {
        if (!isFull()){
            if (rear == -1){
                rear = 0;
            }
            if (rear == data.length - 1){
                rear = 0;
            }
            data[rear++] = value;
            size++;
            return true;
        } else return false;
    }

    @Override
    public boolean insertFront(int value) {
        if (!isFull()){
            if (front == 0 || front == -1){
                front = data.length - 1;
            }
            data[front--] = value;
            size++;
            return true;
        } else return false;
    }

    @Override
    public int removeRear() {
        if (!isEmpty()){
            if (size == 1){
                front = -1;
                rear = -1;
            }
            if (rear == 0){
                rear = data.length - 1;
            } else {
                rear--;
            }
            size--;
            return data[rear];
        }
        return -1;
    }

    @Override
    public int removeFront() {
        if (!isEmpty()){
            if (size == 1){
                front = -1;
                rear = -1;
            }
            if (front == data.length - 1){
                front = 0;
            } else {
                front++;
            }
            size--;
            return data[front];
        }
        return -1;
    }

    @Override
    public int peek() {
        return data[size - 1];
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
    public void displayDequeu() {

       /* for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "|");
        }*/
        System.out.println();
        for (int i = 0; i < size; i++) {
            int index = front + 1;
            if (index < 0){
                index = 0;
            }
            if ((index + i) < data.length){
                System.out.print(data[index + i] + "|");
            } else {
                System.out.print(data[(index + i) - data.length] + "|");
            }
        }
        System.out.println("");
        System.out.println("Front: " + front);
        System.out.println("Rear: " + rear);
        System.out.println("Size: " + size);
        System.out.println("");

    }
}