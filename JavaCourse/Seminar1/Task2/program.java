package JavaCourse.Seminar1.Task2;

/*
 * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
 */

// public class program {
//     public static void main(String[] args) {
//         int[] arr = new int[] { 1, 1, 0, 1, 1, 1 };
//         int counter = 0;
//         int localCounter = 0;
//         for (int elem : arr) {
//             if (elem == 1) {
//                 localCounter++;
//             } else {
//                 counter = (counter < localCounter) ? localCounter : counter;
//                 // if (counter < localCounter) {
//                 // counter = localCounter;
//                 // } else {
//                 // counter = counter;
//                 // }
//                 localCounter = 0;
//             }
//         }
//         counter = (counter < localCounter) ? localCounter : counter;
//         System.out.println(counter);
//     }
// }

// Варивнт 2 - через вложенные циклы
public class program {

    public static void main(String[] args) {

        int[] array = new int[] { 0, 1, 0, 1, 0 };
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            while (i < array.length && array[i] == 1) {
                count++;
                i++;
            }
            if (count > max)
                max = count;
        }
        System.out.println(String.format("Maximum ones into array: %d", max));
    }
}
