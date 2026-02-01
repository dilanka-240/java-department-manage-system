package main.java.com;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // Create empty objects
        Department department = new Department();
        Company company = new Company();
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        Intern intern = new Intern();

        // Create empty lists
        List<Employee> employees = new ArrayList<>();
        List<Department> departments = new ArrayList<>();

        // Pass them into Menu constructor
        Menu menu = new Menu(department, company, fullTimeEmployee, partTimeEmployee, intern, departments, employees);

        // Run the menu
        menu.runMenu();
    }
}