package com;
import java.util.Scanner;
class Employee {
    private int salary;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    public void display(){
        System.out.println("Name of the Employee: "+getName());
        System.out.println("Salary of the Emploee: "+getSalary());
    }
}
    public class New_Class {
    public static void main(String[] args) {
        Employee Emp1=new Employee();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Employee Name: ");
        String str=sc.next();
        Emp1.setName(str);
        System.out.print("Enter the Salary amount: ");
        int sal=sc.nextInt();
        Emp1.setSalary(sal);
        Emp1.display();
    }
}
