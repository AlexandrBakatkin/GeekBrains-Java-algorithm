public interface DequeuInterface {

    boolean insertRear (int value);

    boolean insertFront (int value);

    int removeRear ();

    int removeFront ();

    int peek();

    boolean isEmpty();

    boolean isFull();

    int size();

    void displayDequeu();

}
