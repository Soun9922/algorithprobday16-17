package insertionsort;

import java.util.Arrays;

public class InsertionSort {
    void insertionSortAscen(int[] arr){
        int size = arr.length;

        for (int step = 1; step < size; step++) {
            int key = arr[step];
            int j = step - 1;

            while (j >= 0 && key < arr[j]){
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = key;
        }
    }

    void insertionSortDesecen(int[] arr){
        int size = arr.length;

        for (int step = 1; step < size; step++) {
            int key = arr[step];
            int j = step - 1;

            while (j >= 0 && key > arr[j]){
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] data = {9, 10, 8, 4, 2, 5, 1, 6, 7};
        InsertionSort insertionSort1 = new InsertionSort();
        insertionSort1.insertionSortAscen(data);
        System.out.println("Sorted elements in Ascending order: ");
        System.out.println(Arrays.toString(data));
        InsertionSort insertionSort2 = new InsertionSort();
        insertionSort2.insertionSortDesecen(data);
        System.out.println("Sorted elements in Descending order: ");
        System.out.println(Arrays.toString(data));
    }
}
