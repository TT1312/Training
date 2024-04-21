package com.ArrayListPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class PracticeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// ArrayList
		
		ArrayList<String> l1 = new ArrayList<String>();    // list can hold 10 element default
		ArrayList<Integer> l2 = new ArrayList<Integer>(20);
		ArrayList<Integer> l3 = new ArrayList<Integer>(20);
		
		l1.add("Hii");
		l1.add("WHO WIN ELECTION 2024???");
		l1.add("BJP OR CONGRESS ");
		
		l2.add(3);
		l2.add(5);
		l2.add(6);
		
		
		
		//Approach 1
		System.out.println("Traverse element using for loop ");
		for(int i=0;i<3;i++) {
			System.out.println(l1.get(i));
		}
		
		System.out.println("\n");
		
		//Approach 2
		System.out.println("Traverse element using for each loop ");
		for (String result : l1) {
			System.out.println(result);
		}
		
		System.out.println("\n");
		
		System.out.println(l2.get(1));
		
		System.out.println("\n");
		
		
		//Approach 3
		System.out.println("Traverse element using Iteretor ");
		Iterator<String> str =  l1.iterator();
		while(str.hasNext()) {
			System.out.println("Element is : " + str.next());
		}
		
		System.out.println("\n");
		
		// Approach
		System.out.println("Traverse element using ListIteretor ");
		ListIterator<String> iterat = l1.listIterator();
		while(iterat.hasNext()) {
			System.out.println("Element is : " + iterat.next());
		}
		System.out.println("\n");
		
		while(iterat.hasPrevious()) {
			System.out.println("Element is : " + iterat.previous());
		}
		
		System.out.println("\n");
		
		// check position
		System.out.println("Last index of : " + l1.lastIndexOf("BJP"));
		System.out.println("Index of : " + l1.indexOf("BJP"));
		
		System.out.println("\n");
		
		
		//remove an element
		l1.remove(2);
		System.out.println("Latest array : "+l1);
		
		
		// Join two arraylist
		ArrayList<String> l4 = new ArrayList<String>();
		l4.add("from");
		l4.add("sangli");
		l4.addAll(l1);
		l4.addAll(1, l1);
		
		System.out.println("watch "+ l4);
		
		
		
		
		

	}

}
