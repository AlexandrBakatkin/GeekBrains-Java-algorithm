public class StringStackImplement implements StringStack {

    private char data[];
    private int size = 0;

    public StringStackImplement(int length) {
        this.data = new char [length];
        this.size = 0;
    }

    @Override
    public boolean push(char symbol) {
        if (!isFull()){
            data[size++] = symbol;
            return true;
        } else return false;
    }

    @Override
    public char pop() {
        if (!isEmpty()){
            return data[--size];
        } else return '!';
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
}
