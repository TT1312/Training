package com.ArrayListPractice;
import java.util.*;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeData emp = new EmployeeData(13,"Modi",8000);
		EmployeeData emp1 = new EmployeeData(12,"Shaha",5000);
		EmployeeData emp2 = new EmployeeData(11,"Fadanvis",2000);
		
		ArrayList<EmployeeData> emp3 = new ArrayList<EmployeeData>();
		emp3.add(new EmployeeData(14,"kejriwal",4000));
		emp3.add(new EmployeeData(15,"sanjayKaka",3000));
		emp3.add(new EmployeeData(16,"AjitPawar",1000));
		
		System.out.println("Data is : "+emp3);
		System.out.println("\n");
		
		for(EmployeeData e : emp3) {
			e.increase(10);
		}
		
		for(EmployeeData e : emp3) {
			System.out.println(e);
		}
		
		
		
//		EmployeeData emp = new EmployeeData();
//		emp.setId(13);
//		emp.setName("Tushar");
//		emp.setSalary(50000);
		
//		System.out.println(emp.getId());
//		System.out.println(emp.getName());
//		System.out.println(emp.getSalary());
//		Scanner sc = new Scanner(System.in);
//		String name = sc.next();
		
		switch(emp1.getName()) {
		case "Modi":
			System.out.println("The employee id is: " + emp.getId());
			break;
			
		case "Shaha":
			System.out.println("The employee id is: " + emp1.getId());
			break;
			
		case "Fadanvis":
			System.out.println("The employee id is: " + emp2.getId());
			break;
		default:
			System.out.println("not found");
		
		}
		
	}

}
