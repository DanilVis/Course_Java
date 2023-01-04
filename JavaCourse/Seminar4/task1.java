package JavaCourse.Seminar4;

import java.util.LinkedList;
import java.util.Scanner;

// Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида text~num
// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

public class task1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner iScanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите строку вида text~num: ");
            String str = iScanner.nextLine();
            if (str.equals("exit")) {
                break;
            }

            String[] temp = str.split("~");
            int index = Integer.valueOf(temp[1]);
            if (temp[0].equals("print")) {
                if (index > list.size()) {
                    System.out.println("Нет элемента с таким индексом");
                } else {
                    System.out.println(list.get(index));
                    list.remove(index);
                }
            } else {
                if (index >= list.size()) {
                    for (int i = list.size(); i < index; i++) {
                        list.add(null);
                    }
                    list.add(temp[0]);
                } else {
                    list.add(index, temp[0]);
                }

            }
            System.out.println(list);
        }
        iScanner.close();
    }
}
