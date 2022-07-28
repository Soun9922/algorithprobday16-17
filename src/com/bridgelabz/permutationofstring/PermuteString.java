package com.bridgelabz.permutationofstring;

import java.util.Arrays;
import java.util.Scanner;

public class PermuteString {
    static void swap(char[] arr, int i, int j){
        char c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }
    //Iterative function to find permutations of a string in java
    public static void permutations1(String str){
        if (str == null || str.length() == 0){
            return;
        }

        char[] chars = str.toCharArray();
        int[] p = new int[str.length()];
        int i = 1, j;

        System.out.print(str);

        while (i < str.length()){
            if (p[i] < i){
                j = (i % 2) * p[i];

                swap(chars, i , j);

                System.out.print(" " + String.valueOf(chars));

                p[i]++;
                i = 1;
            }
            else {
                p[i] = 0;
                i++;
            }
        }
    }
    //Recursion method to find permutation of string
    public static void permutations2(String str1, String str2){
        if (str2 == null){
            return;
        }
        if (str2.length() == 0){
            System.out.println(str1);
        }
        for (int i = 0; i < str2.length(); i++) {
            String newStr1 = str1 + str2.charAt(i);

            String newStr2 = str2.substring(0, i) + str2.substring(i + 1);

            permutations2(newStr1, newStr2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any letters to find permutations of swapping:");
        String str = sc.nextLine();
        permutations1(str);
        permutations2(" ",str);
    }
}
