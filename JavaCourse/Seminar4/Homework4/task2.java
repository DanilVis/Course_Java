package JavaCourse.Seminar4.Homework4;

import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

public class task2 {
    public static void main(String[] args) {
        LinkedList<Object> queue = new LinkedList<>();
        enqueue(queue, "q");
        enqueue(queue, "w");
        enqueue(queue, "e");
        enqueue(queue, "r");
        enqueue(queue, "t");
        enqueue(queue, "y");
        System.out.println(queue);
        System.out.println(dequeue(queue));
        System.out.println(first(queue));
    }

    public static void enqueue(LinkedList<Object> list, Object elem) {
        list.addLast(elem);
    }

    public static Object dequeue(LinkedList<Object> list) {
        return list.removeFirst();
    }

    public static Object first(LinkedList<Object> list) {
        return list.getFirst();
    }
}
