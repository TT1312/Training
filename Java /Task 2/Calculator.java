package com.company.wiproPracticeQuestion;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Which calculation want to do : " + " 1. Add" + "2. subtraction" + "3. divide" + "4. multiply");
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);

        int value = sc.nextInt();
        switch (value){
            case 1 :
                int add = a+b;
                System.out.println(add);
                break;

            case 2 :
                int sub = a-b;
                System.out.println(sub);
                break;

            case 3 :
                int divide = a/b;
                System.out.println(divide);
                break;

            case 4 :
                int mul = a*b;
                System.out.println(mul);
                break;

            default:
                System.out.println("Enter another num...");
        }
    }
}
