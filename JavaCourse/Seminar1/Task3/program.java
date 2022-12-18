package JavaCourse.Seminar1.Task3;

// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, 
// а остальные - равны ему.

// public class program {

//     public static void main(String[] args) {
//         int[] arr = new int[] {3, 2, 2, 3};
//         int val = 3;

//         int[] newArr = new int[arr.length];
//         int j = arr.length - 1;
//         int k = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == val) {
//                 newArr[j] = val;
//                 j -= 1;
//             } else {
//                 newArr[k] = arr[i];
//                 k += 1;
//             }
//         }
//         for (int i = 0; i < newArr.length; i++) {
//             System.out.println(newArr[i]);
//         }
//     }
// }

// Вариант 2 - решение без нового массива, не перемешивая
public class program {
    public static void main(String[] args) {
        int[] array = new int[] {4, 3, 2, 1, 2, 3 };
        int last = array.length - 1;
        int value = 3;
        while (last > 0 && array[last] == value)
            last--;
        for (int i = 0; i < last; i++)
            if (array[i] == value) {
                for (int j = i; j < last; j++)
                    array[j] = array[j + 1];
                array[last] = value;
                last--;
            }
        for (int element : array)
            System.out.print(String.format("%d ", element));
    }

}
