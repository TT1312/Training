package com.company.wiproPracticeQuestion;

import java.util.Scanner;

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
