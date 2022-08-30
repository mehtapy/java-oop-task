package org.example;

public class Main {
    public static void main(String[] args) {
        // All methods should only print the name of the employee (Manager or SoftDev) and the name of the method.
        // (i.e) getSalaryPayment() => Ali got 5000 CHF salary payment.

        // Manager(id, firstName, lastName, age, salary, department)

        Manager manager1 = new Manager(1, "John", "Murphy", 45, 10000, "Test");
        Manager manager2 = new Manager(2, "Mark", "Rylie", 51, 10200, "Development");
        Manager manager3 = new Manager(3, "Maria", "Swift", 42, 10500, "HR");

        SoftwareDeveloper softwareDeveloper1 = new SoftwareDeveloper(1, "Alex", "Davies", 27, 6000, "Test", manager1, "Selenium", 7);
        SoftwareDeveloper softwareDeveloper2 = new SoftwareDeveloper(2, "Oliver", "Wilson", 32, 6250, "Development", manager2, "Selenium", 7);
        SoftwareDeveloper newSoftwareDeveloper = new SoftwareDeveloper(3, "Charlie", "Evans", 38, 6600, "Development", manager2, "Selenium", 7);

        Employee newEmployee = new Employee(3, "Max", "Adams", 34, 6000, "Unknown");
        Employee newEmployee2 = new Employee(3, "Mario", "Trix", 30, 6000, "Unknown");

        System.out.println("###########################################################");
        manager1.getNumberOfEmployeesSupervised();
        manager1.hireEmployee(newSoftwareDeveloper);
        manager1.getNumberOfEmployeesSupervised();
        System.out.println("###########################################################");
        System.out.println("SoftDev 1 salary : "+ softwareDeveloper1.getSalary());
        manager1.increaseSalary(softwareDeveloper1, 500);
        softwareDeveloper1.getSalaryPayment();
        softwareDeveloper2.takeABreak();
        System.out.println("###########################################################");
        softwareDeveloper2.writeCode();
        softwareDeveloper1.testCode();
        softwareDeveloper2.pushChanges();
        System.out.println("###########################################################");
        System.out.println(softwareDeveloper1.getSkills());
        System.out.println(softwareDeveloper2.getDepartment());
        System.out.println("###########################################################");
        manager2.getNumberOfEmployeesSupervised();
        manager2.hireEmployee(newSoftwareDeveloper);
        manager2.getNumberOfEmployeesSupervised();
        manager2.getEmployees();
        manager2.getSalaryPayment();
        manager2.takeABreak();
        manager2.fireEmployee(newSoftwareDeveloper);
        manager2.getNumberOfEmployeesSupervised();
        manager2.getEmployees();
        System.out.println("###########################################################");
        manager3.getNumberOfEmployeesSupervised();
        manager3.hireEmployee(newEmployee);
        manager3.getNumberOfEmployeesSupervised();
        manager3.hireEmployee(newEmployee2);
        manager3.getNumberOfEmployeesSupervised();
        manager3.getEmployees();




    }
}