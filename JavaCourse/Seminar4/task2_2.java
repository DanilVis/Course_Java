package JavaCourse.Seminar4;

import java.util.Scanner;
import java.util.Stack;

public class task2_2 {
    public static void main(String[] args) {
        Stack<String> list = new Stack<>();
        Scanner iScanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите строку: ");
            String str = iScanner.nextLine();
            if (str.equals("exit")) {
                break;
            }

            if (str.equals("print")) {
                while (!list.empty()) {
                    System.out.println(list.pop());
                }
            } else if (str.equals("revert")) {
                list.pop();
            } else {
                list.push(str);
            }
        }
        iScanner.close();
    }
}
