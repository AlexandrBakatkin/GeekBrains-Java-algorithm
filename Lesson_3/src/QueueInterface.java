public interface QueueInterface {

    boolean insert (int value);

    int remove ();

    int peek();

    boolean isEmpty();

    boolean isFull();

    int size();

    void displayQueue();
}
