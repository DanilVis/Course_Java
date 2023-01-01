package JavaCourse.Seminar3.Task1;

import java.util.ArrayList;
// import java.util.Collections;
import java.util.Random;

/*
 * Заполнить список десятью случайными числами.
 * Отсортировать список методом sort() и вывести его на экран.
 */
public class program {
    public static void main(String[] args) {
        int size = 10;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            list.add(new Random().nextInt(100));
        }
        System.out.println(list);
        // Collections.sort(list);
        list.sort(null);
        System.out.println(list);
        
    }
}
