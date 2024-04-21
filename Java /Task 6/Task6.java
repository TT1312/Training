package com.recursionTask6;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,5,2,6,3};
		int sum = SumArray(arr,0);
		
		System.out.println(sum);

	}

	private static int SumArray(int[] arr, int i) {
		// TODO Auto-generated method stub
		if(i == arr.length-1) {
			return arr[i];
		}
		return arr[i] + SumArray(arr,i+1);
	}

}
