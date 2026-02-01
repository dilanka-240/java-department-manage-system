package main.java.com;

import java.util.List;

public class Department {

    String name;
    List<Employee> employees;

    public Department(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void removeEmployee(int id) {
        employees.remove(id);
    }

    public String getDepartmentSalaryTotal() {
        double totalSalary = 0;
        for (Employee e : employees) {
            totalSalary = +e.CalculateMonthlyPay();
        }
        return "Total Salary of department " + name + "is: " + totalSalary;
    }

    public void printAllEmployees() {
        for (Employee e : employees) {
            System.out.println("Employee: " + e.getEmployeeInfo());
        }
    }

}
