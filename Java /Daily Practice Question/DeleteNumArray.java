package com.Array;
import java.util.*;
public class DeleteNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		System.out.println("Enter 5 number");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter number you want to delete");
		int deletenum = sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == deletenum) {
				arr[i]=arr[i+1];
			}
			else {
				System.out.println("Number not found");
			}
		}
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("New array is" + arr[i]);
		}
		

	}

}
