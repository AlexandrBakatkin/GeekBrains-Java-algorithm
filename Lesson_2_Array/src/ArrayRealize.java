import java.util.Arrays;

public class ArrayRealize implements ArrayMain{

    private int[] data;
    private int size = 0;

    public ArrayRealize(int maxSize){
        this.data = new int [maxSize];
        this.size = 0;
    }

    @Override
    public boolean add(int value) {
        if (isFull()){
            return false;
        }
        data[size] = value;
        size++;
        return true ;
    }

    @Override
    public boolean delete(int value) {
        int index = findIndex(value);
        return deleteByIndex(index);
    }

    @Override
    public boolean deleteByIndex(int index) {

        if (index < 0 || index >= size) {
            return false;
        }


        for (int i = index; i < size - 1; i++) {
            data[i] = data [i + 1];
        }

        size--;

        return true;
    }

    @Override
    public String display() {
        return "{" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean find(int value) {
        return findIndex(value)!= -1;
    }

    @Override
    public int getByIndex(int index) {
        return data[index];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return data.length == size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int findIndex(int value) {

        for (int i = 0; i < size; i++) {
            if (data[i] == value){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean sortBubble() {

        if (isEmpty()){
            return false;
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (data[i] > data[j]){
                    changeElements(i, j);
                }
            }
        }
    return true;
    }

    @Override
    public void sortSelection() {
        for (int i = 0; i < size - 1; i++) {
            int minElement = i;
            for (int j = i + 1; j < size; j++) {
                if (data[j] < data[minElement]){
                    minElement = j;
                }
            }
            if (i != minElement){
                changeElements(i, minElement);
            }
        }
    }

    @Override
    public void sortInsertion() {
        int in, out;
        for (out = 1; out < size; out++) {
            int temp = data[out];
            in = out;
            while (in > 0 && data[in - 1] >= temp){
                data[in] = data[in - 1];
                --in;
            }
            data[in] = temp;
        }
    }

    @Override
    public boolean deleteEquals() {
        for (int i = 1; i < size - 1; i++) {
            if (data[i] == data[i+1]||data[i] == data[i-1]){
                deleteByIndex(i);
            }
        }
        for (int i = size; i < data.length; i++) {
            data[i] = 0;
        }
        return true;
    }

    @Override
    public void changeElements(int indexA, int indexB) {
        data[indexA] = data[indexA] + data[indexB];
        data[indexB] = data[indexA] - data[indexB];
        data[indexA] = data[indexA] - data[indexB];
    }

    @Override
    public int findBinary(int value) {
        int index = -1;
        int low = 0;
        int high = size - 1;
        int mid;

        if (isEmpty()){
            return -1;
        }

        while (low <= high) {
            mid = (high + low)/2;
            if (data[mid] == value){
                index = mid;
                break;
            }
            if (data[mid] > value){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return index;
    }
}