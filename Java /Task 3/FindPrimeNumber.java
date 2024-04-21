package com.company.wiproPracticeQuestion;
import java.util.Scanner;

// Write a Java program that reads an integer and prints whether it is a prime number using a for loop and if statements.

public class FindPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number \n");
        int num = sc.nextInt();

        boolean value = false;
        for (int i = 2; i < num/2; i++) {
            if (num % i == 0) {
                value = true;
                break;
            }

        }
        if (!value)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");


    }
}
