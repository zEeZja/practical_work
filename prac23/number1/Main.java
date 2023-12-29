package prac23.number1;

import java.util.NoSuchElementException;

// Определение интерфейса очереди Queue
interface Queue<T> {
    void enqueue(T element);  // Добавление элемента в конец очереди
    T dequeue();              // Удаление и возврат элемента из начала очереди
    boolean isEmpty();        // Проверка на пустоту очереди
    int size();               // Возвращает количество элементов в очереди
}

// Базовый класс AbstractQueue
abstract class AbstractQueue<T> implements Queue<T> {
    protected int size;  // Количество элементов в очереди

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    // Остальные методы оставляем абстрактными для реализации в дочерних классах
    public abstract void enqueue(T element);
    public abstract T dequeue();
}

// Реализация класса LinkedQueue
class LinkedQueue<T> extends AbstractQueue<T> {
    private Node<T> front;  // Указатель на начало очереди
    private Node<T> rear;   // Указатель на конец очереди

    // Вложенный класс для узла связанного списка
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public void enqueue(T element) {
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Очередь пустая");
        }
        T data = front.data;
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;  // Очередь опустошена, обнуляем указатель на конец
        }
        return data;
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        // Создаем очередь на основе связанного списка
        Queue<String> linkedQueue = new LinkedQueue<>();

        // Добавляем элементы в очередь
        linkedQueue.enqueue("Первый");
        linkedQueue.enqueue("Второй");
        linkedQueue.enqueue("Третий");
        linkedQueue.enqueue("Четвертый");

        // Выводим элементы очереди и их количество
        while (!linkedQueue.isEmpty()) {
            System.out.println("Элемент: " + linkedQueue.dequeue());
        }
        System.out.println("Размер очереди: " + linkedQueue.size());
    }
}
