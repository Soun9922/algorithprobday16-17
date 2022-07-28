package binarysearchfromwordlist;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of words you wish to input: ");
        int num = sc.nextInt();

        String[] words = new String[num];

        System.out.println("Enter the words");
        for (int i = 0; i < words.length; i++) {
            System.out.print("WORD " + (i + 1) + ": ");
            words[i] = sc.next();
        }
        System.out.println("enter the word you want to search for: ");
        String word = sc.next();

        Arrays.sort(words);

        int index = Arrays.binarySearch(words,word);
        System.out.println(word + " = " + index);
    }
}
