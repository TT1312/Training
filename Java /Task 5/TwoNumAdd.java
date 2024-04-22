package com;
import java.util.*;

// Given an array of integers, write a program that finds if there are two numbers that add up to a specific target. You may assume that each input would have exactly one solution, 
//and you may not use the same element twice. Optimize the solution for time complexity.

public class TwoNumAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,5,1,3,8};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter target value: ");
		int target = sc.nextInt();
		
		
		
		for (int i = 0; i< arr.length;i++) {
			for (int j = i; j< arr.length;j++) {

				if (arr[i]+arr[j]==target)
					System.out.println(arr[i] + " " + arr[j]);
				
			}
			}
			
			
		
	}

}
