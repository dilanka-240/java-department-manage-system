package main.java.com;

import java.util.List;

public class Company {
    List<Department> departments;

    public Company(List<Department> departments) {
        this.departments = departments;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    public void allDepartmentsInfo() {
        for (Department d : departments) {
            System.out.println("Department: " + d.getName() + "\nTotal salary" + d.getDepartmentSalaryTotal());
        }
    }

}
