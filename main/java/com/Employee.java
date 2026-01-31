package main.java.com;

public abstract class Employee {
    String name;
    int id;
    double baseSalary;

    Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    double getBaseSalary() {
        return baseSalary;
    }

    void getBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double CalculateMonthlyPay();

    public String getEmployeeInfo() {
        return "ID: " + id + "Name: " + name + "Salary: " + baseSalary;
    }

}
