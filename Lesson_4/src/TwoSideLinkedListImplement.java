public class TwoSideLinkedListImplement extends LinkedListImplement implements TwoSideLinkedList{

    private Link lastElement;

    @Override
    public void addLast(int value) {

        Link link = new Link (value);

        if (isEmpty()){
            firstElement = link;
        } else {
            lastElement.setNext(link);
        }

        lastElement = link;
    }
}
