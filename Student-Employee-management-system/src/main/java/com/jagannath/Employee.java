package com.jagannath;

public class Employee {
    private String name;
    private double salary;
    private Department department;

    public Employee(){
        System.out.println("employee constructer");
    }

    public Employee(String name, double salary, Department department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void showDetails(){
        System.out.println("NAME: "+name);
        System.out.println("Salary: "+salary);
        department.dept();
    }
}
