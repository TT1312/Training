package com.AutoIdEmployeeInc;

public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeData[] emp = new EmployeeData[2];
		emp[0]= new EmployeeData ("Tushar",525);
		emp[1]= new EmployeeData ("nikhil",268);
		
		System.out.println("Employee 0 "+ emp[0]);
		System.out.println("Employee 1 "+ emp[1]);

	}

}
