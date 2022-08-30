package org.example;


public class Employee implements IEmployee {

    public int id;
    public String firstName;
    public String lastName;
    public int age;
    public double salary;
    public String department;



    //Constructor within parameter

    public Employee(int id, String firstName, String lastName, int age, double salary, String department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    private Employee employee;

    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //implements


    @Override
    public void getSalaryPayment() {
        System.out.println(this.getFirstName() + " " + this.getLastName() + " got " + this.getSalary() + " CHF salary payment!");
    }

    @Override
    public void takeABreak() {

        System.out.println(this.getFirstName() + " took a break! ");
    }


    // Please implement necessary methods to get and set these attributes of employee
    // All methods should only print the name of the employee (Manager or SoftDev) and the name of the method.
}
