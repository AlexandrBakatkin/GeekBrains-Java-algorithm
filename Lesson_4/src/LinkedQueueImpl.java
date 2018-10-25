public class LinkedQueueImpl implements Queue {

    private TwoSideLinkedList linkedList;

    public LinkedQueueImpl() {
        this.linkedList = new TwoSideLinkedListImplement();
    }

    @Override
    public void insert(int value) {
        linkedList.addLast(value);
    }

    @Override
    public int remove() {
        return linkedList.remove().getData();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int size() {
        return linkedList.getSize();
    }

    @Override
    public void displayQueue() {
        linkedList.display();
    }
}
