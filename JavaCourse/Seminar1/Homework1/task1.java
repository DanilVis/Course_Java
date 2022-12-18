package JavaCourse.Seminar1.Homework1;
import java.util.Scanner;

/*
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = iScanner.nextInt();
        iScanner.close();
        
        int triangularNum = num * (num + 1) / 2;
        
        int i = 1;
        int factorial = 1;
        while (i <= num) {
            factorial *= i;
            i++;
        }

        System.out.printf("Треугольное число: %d, факториал: %d", triangularNum, factorial);
    }
}
