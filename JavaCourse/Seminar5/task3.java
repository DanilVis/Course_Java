package JavaCourse.Seminar5;

import java.util.LinkedHashMap;

// Написать метод, который переведёт данное целое число в римский формат.

public class task3 {
    public static void main(String[] args) {
        int number = 2989;
        LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<Integer, String>();
        hashMap.put(1000, "M");
        hashMap.put(900, "CM");
        hashMap.put(500, "D");
        hashMap.put(400, "CD");
        hashMap.put(100, "C");
        hashMap.put(90, "XC");
        hashMap.put(50, "L");
        hashMap.put(40, "XL");
        hashMap.put(10, "X");
        hashMap.put(9, "IX");
        hashMap.put(5, "V");
        hashMap.put(4, "IV");
        hashMap.put(1, "I");
        while (number != 0) {
            for (int i: hashMap.keySet()) {
                while (i <= number) {
                    number -= i;
                    System.out.print(hashMap.get(i));

                }
            }
        }
    }
}
