package JavaCourse.Seminar4.Homework4;

import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

public class task1 {
    public static void main(String[] args) {
        LinkedList<String> userlist = new LinkedList<>();
        userlist.add("q");
        userlist.add("w");
        userlist.add("e");
        userlist.add("r");
        userlist.add("t");
        userlist.add("y");

        LinkedList<String> newList = reverseList(userlist);
        System.out.println(newList);
    }

    // вариант без создания нового списка
    public static LinkedList<String> reverseList(LinkedList<String> list) {
        for (int i = 1; i < list.size(); i++) {
            list.addFirst(list.remove(i));
        }
        return list;
    }
}
