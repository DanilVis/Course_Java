package JavaCourse.Seminar2.Homework2;

import java.util.logging.*;
import java.io.IOException;
import java.util.Arrays;

/*
 * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */
public class task2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task2.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        int[] nums = { 4, 7, 9, 8, 1, 5, 10, 2 };

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                int temp = 0;
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
                logger.info(Arrays.toString(nums));
            }
        }

        System.out.println(Arrays.toString(nums));
    }

}
