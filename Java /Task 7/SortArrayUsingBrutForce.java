package com.BrutForceFunctionTask7;

import java.util.Arrays;

public class SortArrayUsingBrutForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,2,-8,1,6};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
