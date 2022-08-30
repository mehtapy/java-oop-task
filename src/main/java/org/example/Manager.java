package org.example;

import java.util.ArrayList;

public class Manager extends Employee implements IManager{

    private ArrayList<Employee> employees = new ArrayList<>();


    public Manager(int id, String firstName, String lastName, int age, double salary, String department) {
        super(id, firstName, lastName, age, salary, department);
    }

    @Override
    public void increaseSalary(Employee employee,int increase) {
        employee.setSalary(employee.getSalary() + increase);
        System.out.println(employee.getFirstName() + "" + employee.getLastName() +  "`s Salary is increased" + increase +"CHF. New Salary :" + employee.getSalary() );
    }

    @Override
    public void hireEmployee(Employee employee) {
        System.out.println(employee.getFirstName() + " is hired");
        employees.add(employee);
    }

    @Override
    public void fireEmployee(Employee employee) {
        System.out.println(employee.getFirstName()+ " is fired");
        employees.remove(employee);
    }
    @Override
    public  void getNumberOfEmployeesSupervised(){
        System.out.println(this.getFirstName() + " has " + employees.size() + " employees");
    }

    @Override
    public void getEmployees() {
        System.out.println(this.getFirstName() + "" + this.getLastName() + " `s employees :");
        for (Employee employee:employees){
            System.out.println(employee.getFirstName() + " " + employee.getLastName());
        }

    }


    // A Manager has numberOfEmployeesSupervised attribute additionally.
    // Please implement necessary methods to get and set these attributes of Manager

}
