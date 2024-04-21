package com.CreateOwnException.EmployeeCode;

public class Employee {

	public static void main(String[] args) throws InvlidSalaryException {
		// TODO Auto-generated method stub
		EmployeeData emp = new EmployeeData(1312,"Modi",518000);
		EmployeeData emp1 = new EmployeeData(12,"Shaha",600);
		EmployeeData emp2 = new EmployeeData(1,"Fadanvis",25000);
//		EmployeeData emp = new EmployeeData();
//		emp.setId(13);
//		emp.setName("Tushar");
//		emp.setSalary(50000);
		
//		System.out.println(emp.getId());
//		System.out.println(emp.getName());
//		System.out.println(emp.getSalary());
//		Scanner sc = new Scanner(System.in);
//		String name = sc.next();
		try {
			if(emp1.getSalary() > 5000) {
				throw new InvlidSalaryException("Your Salary is not suitable ours Rules and Regulations... ");
			}else {
				System.out.println("You can move Ahead!!!");
			}
			
		}
		catch(InvlidSalaryException e) {
			System.out.println( e.getMessage());
		}
		
		if (emp.getId() > emp2.getId()) {
			if(emp.getSalary() > emp2.getSalary()) {
				System.out.println("Emp is old person in our company...");
			}
		}else {
			System.out.println("this is new employee...");
		}
		
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
