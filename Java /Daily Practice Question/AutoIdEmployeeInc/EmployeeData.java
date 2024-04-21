package com.AutoIdEmployeeInc;

public class EmployeeData {
	
	static int id = 101;
	
	private String name;
	private int empno;
	private int salary;
	
	public EmployeeData(String string, int i) {
		// TODO Auto-generated constructor stub
		this.empno=id++;
		this.name=string;
		this.salary=i;
	}
	
	public void showdata(){
		System.out.println(empno + ":" + name +":" + salary);
	}

	
	
	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		EmployeeData.id = id;
	}

	@Override
	public String toString() {
		return "EmployeeData [name=" + name + ", empno=" + empno + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

	

}
