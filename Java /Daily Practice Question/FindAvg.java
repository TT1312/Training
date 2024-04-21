package com.floatNum;

public class FindAvg {
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		
		int avg = find_avg(arr);
		System.out.println("Average is: " + avg);
		
	}

	private static int find_avg(int[] arr) {
		// TODO Auto-generated method stub
		int value = 0;
		for(int i=0;i<arr.length;i++) {
			value+=arr[i];
		}
		int a = value/arr.length;
		return a;
	}

}
