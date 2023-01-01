package JavaCourse.Seminar3.Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class task2_2 {
    public static void main(String[] args) {
        String[] planets = new String[] {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"};
        ArrayList<String> list = new ArrayList<String>(10);
        for (int i = 0; i < 10; i++) {
            int index = new Random().nextInt(planets.length);
            list.add(planets[index]);
        }
        System.out.println(list);
        for (String planet : planets) {
            int count = Collections.frequency(list, planet);
            System.out.printf("%s: %d\n", planet, count);
            while (count > 1) {
                list.remove(planet);
                count--;
            }
        }
        System.out.println(list);
    }
}