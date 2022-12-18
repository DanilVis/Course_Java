package JavaCourse.Seminar1.Homework1;

/*
 * Вывести все простые числа от 1 до 1000 
 */
public class task2 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            boolean primeNum = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    primeNum = false;
                    break;
                }
            }
            if (primeNum == true) {
                System.out.printf("%d ", i);
            }
        }

    }
}
