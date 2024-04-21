package com.company.wiproPracticeQuestion;

import java.util.Scanner;

//Create a program that declares an array of integers, initializes it with consecutive numbers, and prints the array in reverse order.

public class ReverseArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number \n");
        int[] value = new int[5];

        // Take input as  array
        for (int i = 0; i < value.length; i++) {
             value[i] = sc.nextInt();
        }

        for (int i =value.length-1 ; i >=0 ; i--) {
            System.out.println(value[i]);
        }



    }
}
