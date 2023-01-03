package JavaCourse.Seminar3.Homework3;

import java.util.ArrayList;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него четные числа

public class task2 {
    public static void main(String[] args) {
        int size = 10;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            list.add(new Random().nextInt(100));
        }
        System.out.println(list);
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
