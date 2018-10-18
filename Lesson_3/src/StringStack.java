public interface StringStack {

    boolean push (char symbol);

    char pop ();

    int getSize();

    boolean isFull();

    boolean isEmpty();
}
