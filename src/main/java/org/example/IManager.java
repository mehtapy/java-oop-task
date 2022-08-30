package org.example;

public interface IManager {

    void increaseSalary(Employee employee,int increase);
    void hireEmployee(Employee employee);
    void fireEmployee(Employee employee);
    void getNumberOfEmployeesSupervised();
    void getEmployees();


    // A Manager can increaseSalary, hireEmployee, fireEmployee, and getNumberOfEmployeesSupervised
    // Please implement these methods
}
