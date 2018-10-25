public class Iterator {
    private Link current;
    private Link previous;
    private LinkedListImplement linkedList;

    public Iterator(LinkedListImplement linkedList) {
        this.linkedList = linkedList;
        this.reset();
    }

    public void reset(){
        current = linkedList.getFirstElement();
        previous = null;
    }

    public boolean atEnd(){
        return (current.getNext() == null);
    }

    public void nextLink(){
        previous = current;
        current = current.getNext();
    }

    public Link getCurrent(){
        return current;
    }

    public void insertAfter (int value){
        Link newLink = new Link (value);
        if (linkedList.isEmpty()){
            linkedList.setFirstElement(newLink);
            current = newLink;
        } else {
            newLink.setNext(current.getNext());
            current.setNext(newLink);
            nextLink();
        }
    }

    public void insertBefore (int value){
        Link newLink = new Link (value);
        if (previous == null){
            newLink.setNext(linkedList.getFirstElement());
            linkedList.setFirstElement(newLink);
            reset();
        } else {
            newLink.setNext(previous.getNext());
            previous.setNext(newLink);
            current = newLink;
        }
    }

    public int deleteCurrent(){
        int data = current.getData();
        if (previous == null){
            linkedList.setFirstElement(current.getNext());
            reset();
        } else {
            previous.setNext(current.getNext());
            if (atEnd()){
                reset();
            }else{
                current = current.getNext();
            }
        }

        return data;
    }
}
