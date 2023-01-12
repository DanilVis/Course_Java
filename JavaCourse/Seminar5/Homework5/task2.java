package JavaCourse.Seminar5.Homework5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// Пусть дан список сотрудников:Иван Иванов ( и остальные, полный текст дз будет на платформе)
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.

public class task2 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<String>(Arrays.asList(
            "Иван Иванов",
            "Мария Ефимова",
            "Екатерина Ермакова",
            "Марк Левин",
            "Владимир Лебедев",
            "Иван Кузнецов",
            "Екатерина Смирнова",
            "Ольга Милюкова",
            "Иван Дронов",
            "Владимир Маслов",
            "Мария Сазонова",
            "Мария Морозова",
            "Мария Федорова ",
            "Иван Рожков",
            "Мария Русина"
        ));

        Map<String, Integer> sortedMap =  sortMap(findRepeatedNames(employees));
        System.out.println(sortedMap);
    }

    public static Map<String, Integer> findRepeatedNames(List<String> list) {
        Map<String, Integer> namesList = new HashMap<String, Integer>();

        for (String item : list) {
            String name = item.split(" ")[0];
            if (namesList.containsKey(name)) {
                namesList.put(name, namesList.get(name) + 1);
            } else {
                namesList.put(name, 1);
            }
        }
        namesList.entrySet().removeIf(entry -> entry.getValue() == 1);

        return namesList;
    }

    public static Map<String, Integer> sortMap(Map<String, Integer> map) {
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        int max = 2;
        for (int value : map.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 1; i--) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                String key = entry.getKey();
                if (map.get(key) == i) {
                    sortedMap.put(key, map.get(key));
                }
            }
        }
        return sortedMap;
    }
}
