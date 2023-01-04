package JavaCourse.Seminar4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 1) Написать метод, который принимает массив элементов, 
// помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, 
// помещает их в очередь и выводит на консоль содержимое очереди.

public class task3 {
    public static void main(String[] args) {
        String[] arr = new String[] { "q", "w", "e", "r", "t", "y" };
        showStack(arr);
        showQueue(arr);
    }

    public static void showStack(String[] array) {
        Stack<String> stack = new Stack<>();
        for (String i : array) {
            stack.push(i);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("");
    }

    public static void showQueue(String[] array) {
        Queue<String> queue = new LinkedList<>();
        for (String i : array) {
            queue.add(i);
        }
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}
