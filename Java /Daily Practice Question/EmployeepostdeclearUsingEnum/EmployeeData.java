package com.company.wiproPracticeQuestion.EmployeepostdeclearUsingEnum;
enum EmployeePost{
    MANAGER,
    DEVELOPER,
    TESTER
}
public class EmployeeData {
    private String name;
    private EmployeePost type;

    EmployeeData(String name,EmployeePost type){
        this.name=name;
        this.type=type;
    }

    public EmployeePost getType() {
        return type;
    }

    public void performDuties() {
        switch (type){
            case MANAGER -> System.out.println(name + " is manager");
            case DEVELOPER -> System.out.println(name + " is developer");
            case TESTER -> System.out.println(name + " is tester");
        }

    }
}
