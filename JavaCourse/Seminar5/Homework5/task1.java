package JavaCourse.Seminar5.Homework5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

public class task1 {
    public static Map<String, ArrayList<String>> phonebook = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nPhonebook:\n" +
                    "1 - add record\n" +
                    "2 - all records\n" +
                    "3 - search by name\n" +
                    "0 - exit");
            System.out.print("Enter a number: ");
            String choice = getData();
            if (choice.equals("1")) {
                addRecord();
            } else if (choice.equals("2")) {
                showAll();
            } else if (choice.equals("3")) {
                findRecord();
            } else if (choice.equals("0")) {
                break;
            }
        }
    }

    public static void addRecord() {
        System.out.print("Enter a name: ");
        String name = getData();
        System.out.print("Enter a phone number: ");
        String number = getData();

        if (phonebook.containsKey(name)) {
            phonebook.get(name).add(number);
        } else {
            ArrayList<String> numbers = new ArrayList<String>();
            numbers.add(number);
            phonebook.put(name, numbers);
        }
    }

    public static void showAll() {
        for (var item : phonebook.entrySet()) {
            System.out.printf("%s, phone numbers: %s \n", item.getKey(), item.getValue());
        }
    }

    public static void findRecord() {
        System.out.print("Enter a name: ");
        String name = getData();
        if (phonebook.containsKey(name)) {
            System.out.printf("%s, phone numbers: %s \n", name, phonebook.get(name));
        } else {
            System.out.println("Not found.");
        }
    }

    public static String getData() {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        return data;
    }
}
