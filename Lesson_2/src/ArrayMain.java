public interface ArrayMain {

    boolean add(int value);

    boolean delete(int value);

    boolean deleteByIndex(int index);

    String display();

    boolean find(int value);

    int getByIndex (int index);

    boolean isEmpty ();

    boolean isFull ();

    int getSize ();

    int findIndex (int value);

    int findBinary (int value);

    boolean sortBubble ();

    void sortSelection();

    void sortInsertion();

    boolean deleteEquals();

    void changeElements(int indexA, int indexB);
}
