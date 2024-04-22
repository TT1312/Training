package com.company.wiproPracticeQuestion.EmployeepostdeclearUsingEnum;

public class EmployeePostDeclear {
    public static void main(String[] args) {
        EmployeeData e1 = new EmployeeData("Tushar",EmployeePost.MANAGER);
        EmployeeData e2 = new EmployeeData("Nikhil",EmployeePost.DEVELOPER);
        EmployeeData e3 = new EmployeeData("Akshay",EmployeePost.TESTER);

        e1.performDuties();
        e2.performDuties();
        e3.performDuties();
    }
}
