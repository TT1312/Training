package com.company.wiproPracticeQuestion;

//write a program that declares two integer variables, swaps their values without using a third variable, and prints the result.

public class Swapnumber {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Value of a is: " + a+ "\n" + "Value of b is: " + b);
    }
}
