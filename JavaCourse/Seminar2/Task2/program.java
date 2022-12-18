package JavaCourse.Seminar2.Task2;

import java.util.Scanner;

/*
 * Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd. Результат - a4b3cd2 
 */
public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите символы: ");
        String str = sc.nextLine();
        sc.close();

        int count = 1;
        String result = "";
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                if (count == 1) {
                    result += str.charAt(i - 1);
                } else {
                    result += str.charAt(i - 1);
                    result += count;
                }
                count = 1;
            }
        }
        result += str.charAt(str.length() - 1);
        if (count != 1) result += count;
        
        System.out.println(result);
    }
}
