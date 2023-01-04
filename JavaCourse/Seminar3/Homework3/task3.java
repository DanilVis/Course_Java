package JavaCourse.Seminar3.Homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

public class task3 {
    public static void main(String[] args) {
        int size = 9;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            list.add(new Random().nextInt(100));
        }
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(findMid(list));
        
    }

    public static int findMid(ArrayList<Integer> arr) {
        arr.sort(null);
        return arr.get(arr.size() / 2);
    }
}
