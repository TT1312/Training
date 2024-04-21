package com.linearSearch;

public class PerformLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,4,2,65,2};
		int target = 65;
		
		int index = linearsearch(arr,target);
		
		if(index != -1) {
			System.out.println(index);
		}
		else {
			System.out.println("-1");
		}
		
	}

	public static int linearsearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}

}
