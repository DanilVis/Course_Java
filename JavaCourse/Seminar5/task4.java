package JavaCourse.Seminar5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

public class task4 {
    public static void main(String[] args) {
        System.out.println(checkBrackets("{2+3(1)}<>"));
        System.out.println(checkBrackets("{2+3(1)<}>"));
    }

    public static boolean checkBrackets(String s) {
        Stack<Character> st = new Stack<Character>();
        List<Character> brackets = new ArrayList<>(Arrays.asList('(', ')', '[', ']', '{', '}', '<', '>'));
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(', '[', '{', '<':
                    st.push(s.charAt(i));
                    break;
                case ')', ']', '}', '>':
                    if (st.isEmpty())
                        return false;
                    char top = st.pop();
                    if (s.charAt(i) != brackets.get(brackets.indexOf(top) + 1)) {
                        return false;
                    }
                    break;
            }
        }
        if (!st.isEmpty())
            return false;
        return true;
    }
}
