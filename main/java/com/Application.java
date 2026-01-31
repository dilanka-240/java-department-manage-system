package main.java.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1, "Dilanka", 1000.00);
        Employee e2 = new FullTimeEmployee(2, "Kasun", 1200.00);

        List<Employee> employees = new ArrayList<>(Arrays.asList(e1, e2));
        Department softwareDept = new Department("Software", employees);

        List<Department> departments = new ArrayList<>(Arrays.asList(softwareDept));
        Company myCompany = new Company(departments);

        Menu menu = new Menu(softwareDept, myCompany, e1);

        menu.runMenu();
    }
}