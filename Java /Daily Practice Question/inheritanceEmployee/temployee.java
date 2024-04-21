package com.inheritanceEmployee;

public class temployee extends empdata{

	public temployee(int eno, String ename, double salary) {
		super(eno, ename, salary);
		// TODO Auto-generated constructor stub
		
		double bonus = salary * 0.02;
		salary += bonus;
		System.out.println("Temprory employee : " + " no is "+ eno + " name is " + ename + " new salary is " + salary) ;
	}
	

}
