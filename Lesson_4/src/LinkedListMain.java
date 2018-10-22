import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
    public static void main(String[] args) {
/*        System.out.println("Test Stack");
        testStack();
        System.out.println("Test Queue");
        testQueue();*/
        System.out.println("Test Iterator");
        testIterator();
    }

    private static void testStack() {
        LinkedStackImpl linkedStack = new LinkedStackImpl();
        for (int i = 0; i < 10; i++) {
            linkedStack.push(i);
        }
        System.out.println(linkedStack.getSize());

        for (int i = 0; i < 10; i++) {
            System.out.print(linkedStack.pop());
        }

        System.out.println();
    }

    private static void testQueue() {
        LinkedQueueImpl linkedQueue = new LinkedQueueImpl();
        for (int i = 0; i < 10; i++) {
            linkedQueue.insert(i);
        }
        linkedQueue.displayQueue();
        for (int i = 0; i < 10; i++) {
            linkedQueue.remove();
        }
        System.out.print("Очередь: ");
        linkedQueue.displayQueue();
        System.out.println();
    }

    private static void testIterator() {
        List<Integer> linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        for (Integer value : linkedList) {
            System.out.println(value);
        }

        LinkedListImplement list = new LinkedListImplement();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.getFirstElement());
        list.display();

        for (Link value : list) {
            System.out.println(value);
        }
    }
}