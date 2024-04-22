package com;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		
		System.out.println("Enter Calculate Method Num : " + "1. Addition " + "2. Sub "+ "3. divide "+ "4. Multiply");
		
		int value = sc.nextInt();
		switch(value) {
		case 1: 
			int add = a+b;
			System.out.println(add);
			break;
			
		case 2: 
			int sub = a-b;
			System.out.println(sub);
			break;
			
		case 3: 
			int divide = a/b;
			System.out.println(divide);
			break;
			
		case 4: 
			int mul = a*b;
			System.out.println(mul);
			break;	
			
		default:
			System.out.println("Enter another number...");
		}
	}

}
