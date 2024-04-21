package com.ArrayListPractice;

import java.util.*;
public class LinkedlistQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> link =  new LinkedList<String>();
		link.add("Rushar");
		link.add("nik");
		link.add("aki");
		
		System.out.println("Output is " + link);
		
		LinkedList<String> link2 =  new LinkedList<String>();
		link2.add("kya baat hai!!!");
		
		LinkedList<String> link1 =  new LinkedList<String>();
		
		link1.add("Studid in same college ");
		link1.addAll(link);
		System.out.println("Output is : " + link1);
		
		link1.addAll(2, link2);
		link1.addFirst("hii");
		
	
		
		System.out.println("Output is : " + link1);
		
		link1.remove(2);
		System.out.println("Latest array : "+link1);
		
		System.out.println("\n");
		
		LinkedList<Integer> link4 =  new LinkedList<Integer>();
		
		link4.add(5);
		link4.add(3);
		link4.add(2);
		link4.add(1);
		
		for (int element : link4) {
			System.out.println("Element are : " + element);
		}
		
		int sum = 0;
		for(int add : link4) {
		
			sum+=add;
		}
		System.out.println("Addition of Element is : " + sum);
		
		
	}

}
