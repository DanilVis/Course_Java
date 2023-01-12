package JavaCourse.Seminar6.Homework6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
// Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию: 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

public class program {
    public static void main(String[] args) {
        Notebook nb1 = new Notebook("ASUS Laptop 15", 25000, "Intel", 4, 256, "Windows");
        Notebook nb2 = new Notebook("Apple MacBook Air", 105000, "Apple", 8, 256, "macOS");
        Notebook nb3 = new Notebook("Apple MacBook Pro", 161000, "Apple", 16, 512, "macOS");
        Notebook nb4 = new Notebook("ASUS VivoBook 15", 60000, "Intel", 8, 512, "Windows");
        Notebook nb5 = new Notebook("ASUS TUF Gaming F15", 85000, "Intel", 16, 512, "Windows");
        Notebook nb6 = new Notebook("Lenovo V15 ADA", 28000, "AMD", 4, 256, "Linux");

        HashSet<Notebook> nbList = new HashSet<>(Arrays.asList(nb1, nb2, nb3, nb4, nb5, nb6));

        Map<String, String> filters = setFilters();
        System.out.print("Выбранные параметры:");
        System.out.println(filters);
        HashSet<Notebook> result = showNotebooks(nbList, filters);
        for (Notebook nb : result) {
            System.out.println(nb);
        }

    }

    public static HashMap<String, String> setFilters() {
        HashMap<String, String> filters = new HashMap<>();
        ArrayList<String> filterName = new ArrayList<>(Arrays.asList("price", "processor", "ram", "hdd", "os"));
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose parameter to set filter:\n" +
                    "1 - price\n" +
                    "2 - processor (Intel, AMD, Apple)\n" +
                    "3 - ram (GB)\n" +
                    "4 - hdd (GB)\n" +
                    "5 - OS (Windows, Linux, MacOS)\n" +
                    "0 - Stop");
            System.out.print("Ener a number: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 0)
                break;

            System.out.print("Enter (minimal) value: ");
            String value = scanner.nextLine();
            filters.put(filterName.get(choice - 1), value);
        }
        scanner.close();
        return filters;
    }

    public static HashSet<Notebook> showNotebooks(HashSet<Notebook> notebooks, Map<String, String> parameters) {
        HashSet<Notebook> result = new HashSet<>();
        for (Notebook nb : notebooks) {
            boolean isMatch = true;
            for (HashMap.Entry<String, String> entry : parameters.entrySet()) {
                if (entry.getKey().equals("processor")) {
                    if (!nb.getProcessor().equals(entry.getValue())) {
                        isMatch = false;
                        break;
                    }
                } else if (entry.getKey().equals("os")) {
                    if (!nb.getOS().equals(entry.getValue())) {
                        isMatch = false;
                        break;
                    }
                } else if (entry.getKey().equals("price")) {
                    if (nb.getPrice() < Integer.parseInt(entry.getValue())) {
                        isMatch = false;
                        break;
                    }
                } else if (entry.getKey().equals("ram")) {
                    if (nb.getRam() < Integer.parseInt(entry.getValue())) {
                        isMatch = false;
                        break;
                    }
                } else if (entry.getKey().equals("hdd")) {
                    if (nb.getHdd() < Integer.parseInt(entry.getValue())) {
                        isMatch = false;
                        break;
                    }
                }
            }
            if (isMatch == true) {
                result.add(nb);
            }
        }
        return result;
    }
}
