import java.util.Iterator;

public class LinkedListImplement implements LinkedList, Iterable<Link>{

    protected Link firstElement;
    protected int size;

    public LinkedListImplement() {
        this.size = 0;
    }

    @Override
    public void add(int value) {
        Link link = new Link(value);
        link.setNext(firstElement);
        firstElement = link;
        size++;
    }

    @Override
    public Link remove() {
        Link temp = firstElement;
        firstElement = temp.getNext();
        size--;
        return temp;
    }

    @Override
    public boolean isEmpty() {
        return firstElement == null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Link search(int value) {
        Link currentLink = firstElement;

        while (currentLink != null){
            if (currentLink.getData() == value){
                return currentLink;
            }
            currentLink = currentLink.getNext();
        }
        return null;
    }

    @Override
    public Link remove(int value) {
        Link currentLink = firstElement;
        Link previousLink = null;

        while (currentLink != null){
            if (currentLink.getData() == value){
                break;
            }
            previousLink = currentLink;
            currentLink = currentLink.getNext();
        }

        if (currentLink == null){
            return null;
        }

        if (previousLink == null){
            firstElement = currentLink.getNext();
        } else {
            previousLink.setNext(currentLink.getNext());
        }

        size--;

        return currentLink;
    }

    @Override
    public void display() {
        Link currentLink = firstElement;

        while (currentLink != null){
            System.out.print(currentLink);
            System.out.print(" -> ");
            currentLink = currentLink.getNext();
        }

        System.out.println();
    }

    @Override
    public Link getFirstElement() {
        return firstElement;
    }

    @Override
    public void setFirstElement(Link firstElement) {
        this.firstElement = firstElement;
    }


    @Override
    public Iterator<Link> iterator() {

        return new Iterator<Link>() {

            Link currentLink = firstElement;
            Link tempLink;

            @Override
            public boolean hasNext() {
                if (currentLink.getNext() != null){
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public Link next() {
                if (currentLink.getNext() != null){
                    tempLink = currentLink;
                    currentLink = currentLink.getNext();
                    return tempLink.getNext();
                }else{
                    return null;
                }

            }
        };
    }
}