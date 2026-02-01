package main.java.com;

import java.util.ArrayList;
import java.util.List;

public class Company {
    List<Department> departments;
    String companyName;

    public Company() {
        this.companyName = "";
        this.departments = new ArrayList<>();
    }

    public Company(String companyName, List<Department> departments) {
        this.companyName = companyName;
        this.departments = departments;

    }

    public void setComanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
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
