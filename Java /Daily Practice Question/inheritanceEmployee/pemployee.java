package com.inheritanceEmployee;

public class pemployee extends empdata{

	public pemployee(int eno, String ename, double salary) {
		super(eno, ename, salary);
		// TODO Auto-generated constructor stub
		
		double bonus = salary * 0.1;
		salary += bonus;
		System.out.println("Permant employee : " + " no is "+ eno + " name is " + ename + " new salary is " + salary) ;
	}
	

}
