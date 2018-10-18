public class StackImplement implements StackInterface {

    private int data[];
    private int size = 0;


    public StackImplement(int maxSize) {
        this.data = new int [maxSize];
        this.size = 0;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()){
            data[size++] = value;
        } else return false;
        return true;
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            return data[--size];
        } return -1;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int peek() {
        if (isEmpty()){
            return -1;
        }
        else {
            return data[size-1];
        }
    }
}