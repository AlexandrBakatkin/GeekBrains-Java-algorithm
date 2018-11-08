import java.util.HashMap;
import java.util.Map;

public class MainHash {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

        Map<String, Integer> map = new HashMap<>();

        Item item1 = new Item(22);
        Item item2 = new Item(7);
        Item item3 = new Item(59);
        Item item4 = new Item(15);
        Item item5 = new Item(17);
        Item item6 = new Item(1);

        hashTable.insert(item1);
        hashTable.insert(item2);
        hashTable.insert(item3);
        hashTable.insert(item4);
        hashTable.insert(item5);
        hashTable.insert(item6);


        hashTable.display();
        System.out.println("______________");
        System.out.println(hashTable.find(11));
        System.out.println(hashTable.find(59));
        System.out.println(hashTable.find(1));
        System.out.println(hashTable.remove(59));
        System.out.println("___________________");
        hashTable.display();
    }

}
