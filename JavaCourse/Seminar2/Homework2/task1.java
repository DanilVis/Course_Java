package JavaCourse.Seminar2.Homework2;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, 
 * используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
 * Если значение null, то параметр не должен попадать в запрос.
 * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */
public class task1 {
    public static void main(String[] args) {
        Map<String, String> students = new LinkedHashMap<>();
        students.put("name", "Ivanov");
        students.put("country", "Russia");
        students.put("city", "Moscow");
        students.put("age", null);

        String req = "SELECT * FROM students WHERE ";

        StringBuilder where = new StringBuilder();
        for (Map.Entry<String, String> pair: students.entrySet()) {
            if (pair.getValue() != null) {
                where.append(pair.getKey() + " = " + "'" + pair.getValue() + "'" + " AND ");
            }
        }
        where.delete(where.length() - 5, where.length());
        System.out.println(req + where);
    }
}
