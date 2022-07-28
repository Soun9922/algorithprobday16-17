package bubblesorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortMain {
    void bubbleSortAscend(int arr[]) {
        int size = arr.length;
        //loop to access each array element
        for (int i = 0; i < size; i++)
            //loop to compare array elements
            for (int j = 0; j < size - 1; j++)
                //compare two adjacent elements
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    void bubbleSortDescend(int arr[]){
        int size = arr.length;

        for (int i = 0; i < size; i++)
            for (int j = 0; j < size - 1; j++)
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements you want to store: ");
        int num = sc.nextInt();
        int[] data = new int[num];
        System.out.println("Enter numbers to be sorted: ");
        for (int i = 0; i < num; i++) {
            data[i] = sc.nextInt();
        }
        BubbleSortMain bubbleSort1 = new BubbleSortMain();
        bubbleSort1.bubbleSortAscend(data);
        System.out.println("Sorted numbers in ascending order: ");
        System.out.println(Arrays.toString(data));

        BubbleSortMain bubbleSort2 = new BubbleSortMain();
        bubbleSort2.bubbleSortDescend(data);
        System.out.println("Sorted numbers in descending order: ");
        System.out.println(Arrays.toString(data));
    }
}
