import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Array {
    public static void main(String[] args) {
        int numb;
        Random random = new Random();
        ArrayRealize ArrTest = new ArrayRealize(10);       // Тестовый массив, на котором проверялось работоспособность кода

        ArrayRealize ArrBubble = new ArrayRealize(10000);    //Массив для пузырьковой сортировки
        ArrayRealize ArrSelect = new ArrayRealize(10000);    //Массив для сортировки выбором
        ArrayRealize ArrInsert = new ArrayRealize(10000);    //Массив для сортировки вставкой

        for (int i = 0; i < 8; i++) {
            ArrTest.add(random.nextInt(10));
        }

        //Решил не копировать массивы, а создать три массива и заполнить их циклом одинаковыми случайными значения.
        // Не знаю, лучше ли такой вариант копирования массивов.

        for (int i = 0; i < 10000; i++) {
            numb = random.nextInt(1000000);
            ArrBubble.add(numb);
            ArrInsert.add(numb);
            ArrSelect.add(numb);
        }

        System.out.println("_________________________________");
        System.out.println("Выводим неотсортированные массивы");

        System.out.println(ArrTest.display());
        System.out.println(ArrBubble.display());
        System.out.println(ArrSelect.display());
        System.out.println(ArrInsert.display());

        System.out.println("Выводим элемент тестового массива с индексом 2: " + ArrTest.getByIndex(2));
        System.out.println("Ищем в тестовом массиве элемент 7: " + ArrTest.findIndex(7));
        System.out.println("_________________________________");


        System.out.println("Сортируем массивы");


        ArrTest.sortSelection();
        long start = System.nanoTime();
        ArrBubble.sortBubble();
        long finish = System.nanoTime();
        long time = finish - start;
        System.out.println("Время сортировки Bubble: " + TimeUnit.NANOSECONDS.toMillis(time) + " ms");

        start = System.nanoTime();
        ArrSelect.sortSelection();
        finish = System.nanoTime();
        System.out.println("Время сортировки выбором: " + TimeUnit.NANOSECONDS.toMillis(finish - start) + " ms");

        start = System.nanoTime();
        ArrInsert.sortInsertion();
        finish = System.nanoTime();
        System.out.println("Время сортировки вставкой: " + TimeUnit.NANOSECONDS.toMillis(finish - start) + " ms");


        System.out.println("Отсортированный тестовый массив методом Bubble");
        System.out.println(ArrTest.display());
        System.out.println("Отсортированный массив методом Bubble");
        System.out.println(ArrBubble.display());
        System.out.println("Отсортированный массив методом выбора");
        System.out.println(ArrSelect.display());
        System.out.println("Отсортированный массив методом вставки");
        System.out.println(ArrInsert.display());
        System.out.println("________________");
        System.out.println("Поиск");
        System.out.println("Поиск индекс элемента 7: " + ArrTest.findBinary(7));
        System.out.println("Добавляем элемент 10 в тестовый массив: " + ArrTest.add(10));
        System.out.println(ArrTest.display());
        System.out.println("Поиск индекс элемента 10: " + ArrTest.findBinary(10));
        System.out.println("Find 125: " + ArrBubble.find(125));
        System.out.println("Find 125: " + ArrBubble.findBinary(125));
        System.out.println("______________________");
    }
}
