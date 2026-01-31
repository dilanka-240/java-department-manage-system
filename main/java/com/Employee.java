package main.java.com;

public abstract class Employee {
    String name;
    int id;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    double getSalary() {
        return salary;
    }

    void getSalary(double salary) {
        this.salary = salary;
    }

    public abstract double CalculateMonthlyPay();

    public String getEmployeeInfo() {
        return "ID: " + id + "Name: " + name + "Salary: " + salary;
    }

}
