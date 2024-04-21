package com.String;

public class Literals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nik = "Apples";
		String tush = "Mango";
		String aki = "chiku";
		String Gaurav = "Mango";
		
		String s1 = new String("Mango");
		
		
		// using equal() operator
		System.out.println(nik.equals(aki));
		System.out.println(Gaurav.equals(tush));
		System.out.println(Gaurav.equals(s1));
		
		// using == operator
		System.out.println(nik == aki);
		System.out.println(Gaurav == tush);
		System.out.println(Gaurav == s1);
		
		
		// using compareTo operator
		System.out.println(nik.compareTo(Gaurav));
		
		
	}

}
