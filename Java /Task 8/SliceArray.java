package com.company.wiproPracticeQuestion;

import java.util.Arrays;
import java.util.Scanner;

//  Implement a method SliceArray that takes an array, a starting index, and an end index,
//  then returns a new array containing the elements from the start to the end index.


public class SliceArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] SliceArray = new int[10];
        for (int i = 0; i < 10; i++) {
            SliceArray[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(SliceArray));

        int start = 4;
        int end = 7;

        int[] newArray = subArray(SliceArray, start, end);


        System.out.println("Sliced Array: " + Arrays.toString(newArray));
    }

    public static int[] subArray(int[] array, int start, int end) {


        int[] shortArray = new int[end - start + 1];
        for (int i = 0; i < shortArray.length; i++) {
            shortArray[i] = array[start + i];
            }

            return shortArray;
    }




}
