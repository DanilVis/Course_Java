package JavaCourse.Seminar2.Task1;

import java.util.Scanner;

/*
 * Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, 
 * которая состоит из чередующихся символов c1 и c2, начиная с c1.
 */

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите четное число: ");
        int n = iScanner.nextInt();
        iScanner.close();

        String s1 = "*";
        String s2 = "/";
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n / 2; i++) {
            result.append(s1 + s2);
        }
        System.out.println(result);
    }
}
