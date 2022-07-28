package insertionsort;

import java.util.Arrays;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store: ");
        int num = sc.nextInt();
        int[] data = new int[num];
        System.out.println("Enter the elements you want to sort: ");
        for (int i = 0; i < num; i++) {
            data[i]= sc.nextInt();
        }
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
