package JavaCourse.Seminar3.Homework3;

import java.util.Arrays;

// Реализовать алгоритм сортировки слиянием

public class task1 {
    public static void main(String[] args) {
        int[] originalArr = {62, 3, 19, 6, 55, 6, 63, 90, 46};
        int length = originalArr.length;
        mergeSort(originalArr, 0, length - 1);
        System.out.println(Arrays.toString(originalArr));
    }

    public static void mergeSort(int[] arr, int firstIndex, int lastIndex) {
        if (firstIndex < lastIndex) {
            int mid = (firstIndex + lastIndex) / 2;
            mergeSort(arr, firstIndex, mid);
            mergeSort(arr, mid + 1, lastIndex);
            merge(arr, firstIndex, mid, lastIndex);
        }
    }

    public static void merge(int[] arr, int firstIndex, int mid, int lastIndex) {
        int n = lastIndex-firstIndex+1;
        int[] temp = new int[n];

        int i = firstIndex, j = mid + 1;
        int k = 0;

        while (i <= mid || j <= lastIndex) {
            if (i > mid)
                temp[k++] = arr[j++];
            else if (j > lastIndex)
                temp[k++] = arr[i++];
            else if (arr[i] < arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }
        for (j = 0; j < n; j++)
            arr[firstIndex + j] = temp[j];
    }
}
