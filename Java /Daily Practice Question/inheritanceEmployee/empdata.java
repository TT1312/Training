package com.inheritanceEmployee;

public class empdata {
	
	private int eno;
	private String ename;
	private double salary;
	
	public empdata(int eno, String ename, double salary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "empdata [eno=" + eno + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
	
	

}
