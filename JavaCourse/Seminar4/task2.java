package JavaCourse.Seminar4;

import java.util.LinkedList;
import java.util.Scanner;

// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.

public class task2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner iScanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите строку: ");
            String str = iScanner.nextLine();
            if (str.equals("exit")) {
                break;
            }

            if (str.equals("print")) {
                System.out.println(list);
            } else if (str.equals("revert")) {
                list.removeFirst();
            } else {
                list.addFirst(str);
            }
        }
        iScanner.close();
    }
}
