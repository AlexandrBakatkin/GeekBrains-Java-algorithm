public class Stack {
    public static void main(String[] args) {
        StackImplement stackImp = new StackImplement(5);

        QueueImplement queueImp = new QueueImplement(5);

        PriorityQueueImplement priorQueueImp = new PriorityQueueImplement(10);

        DequeuImplement dequeuImp = new DequeuImplement(10);

        System.out.println("Демонстрация работы стека:");

        for (int i = 0; i < 6; i++) {
            System.out.println("Вставляем в стек " + i + "-ый элемент: " + stackImp.push(i));
        }

        System.out.println("Значение верхнего элемента стека: " + stackImp.peek());
        System.out.println("Размер стека: " + stackImp.getSize());
        System.out.println("Стек полный? " + stackImp.isFull());

        for (int i = 0; i < 6; i++) {
            System.out.println(stackImp.pop()); //Если пробуем взять элемент из пустого стека, возвращается -1
        }

        System.out.println("Стек пустой? " + stackImp.isEmpty());


        System.out.println();
        System.out.println("__________________________");


        System.out.println("Демонстрация работы очереди");

        for (int i = 0; i < 6; i++) {
            System.out.println(queueImp.insert(i));
        }
        System.out.println("Длина очереди: " + queueImp.size());


        for (int i = 0; i < 3; i++) {
            System.out.println(queueImp.remove());
        }

        System.out.println("Длина очереди: " + queueImp.size());

        System.out.println();
        System.out.println("__________________________");


        System.out.println("Демонстрация работы очереди с приоритетом");

        priorQueueImp.insert(2);
        priorQueueImp.insert(5);
        priorQueueImp.insert(1);
        priorQueueImp.insert(9);
        priorQueueImp.insert(3);
        priorQueueImp.insert(7);

        priorQueueImp.displayQueue();
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println("Удаляем элемент: " + priorQueueImp.remove());
        }
        System.out.println();
        priorQueueImp.displayQueue();
        System.out.println();

        System.out.println();
        System.out.println("__________________________");

        System.out.println("Демонстрация работы dequeue");
        for (int i = 1; i < 5; i++) {
            dequeuImp.insertRear(i);
        }

        dequeuImp.displayDequeu();

        for (int i = 10; i < 13; i++) {
            dequeuImp.insertFront(i);
        }
        dequeuImp.displayDequeu();

        System.out.println("Delete rear: " + dequeuImp.removeRear());

        dequeuImp.displayDequeu();

        for (int i = 0; i < 5; i++) {
            System.out.println("Delete front: " + dequeuImp.removeFront());
        }

        dequeuImp.displayDequeu();

        System.out.println();
        System.out.println("__________________________");
        System.out.println("Демонстрация работа программы переворота строки");

        //Программа для чтения строки справа налево. Используется стек на базе массива символов

        String str;
        str = "Леша на полке клопа нашел"; //Вводим строку, которую нужно перевернуть
        System.out.println(str);           //Выводим для наглядности исходную строку в консоль

        StringStackImplement reverseString = new StringStackImplement(str.length());

        //Заполняем стек циклом
        for (int i = 0; i < str.length(); i++) {
            reverseString.push(str.charAt(i));
        }

        //Берем символы из стека в СтрингБилдер
        StringBuilder sb = new StringBuilder();
        int length = reverseString.getSize();

        for (int i = 0; i < length; i++) {
            sb.append(reverseString.pop());
        }

        System.out.println(sb);
        System.out.println("____________________________");
        System.out.println("Проверяем, пуст ли стек: " + reverseString.isEmpty());
    }
}
