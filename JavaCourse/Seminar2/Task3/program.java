package JavaCourse.Seminar2.Task3;

import java.util.Scanner;

/*
 * Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом 
 * (возвращает boolean значение).
 */
public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите символы: ");
        String str = sc.nextLine();
        sc.close();

        System.out.println(palindrome(str));
    }

    public static boolean palindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            } 
        }
        return true;
    }
}
