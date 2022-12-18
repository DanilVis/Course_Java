package JavaCourse.Seminar1.Homework1;

import java.util.Scanner;

/*
 * Реализовать простой калькулятор
 */
public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double firstNum = iScanner.nextDouble();
        System.out.print("Введите второе число: ");
        double secondNum = iScanner.nextDouble();
        System.out.print("Введите знак операции (+, -. *, /): ");
        String operation = iScanner.next();
        iScanner.close();

        double res = 0;
        switch (operation) {
            case "+":
                res = firstNum + secondNum;
                break;
            case "-":
                res = firstNum - secondNum;
                break;
            case "*":
                res = firstNum * secondNum;
                break;
            case "/":
                res = firstNum / secondNum;
                break;
        }
        System.out.printf("Результат: %.2f", res);

    }
}
