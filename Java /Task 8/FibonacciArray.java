package com.company.wiproPracticeQuestion;

// Create a recursive function to find the nth element of a Fibonacci sequence and store the first n elements in an array.

public class FibonacciArray {
    public static void main(String[] args) {
        int n = 12;

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

