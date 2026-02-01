package main.java.com;

public class Application {
    public static void main(String[] args) {
        Department department = new Department();
        Company company = new Company();
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        Intern intern = new Intern();

        Menu menu = new Menu(department, company, fullTimeEmployee, partTimeEmployee, intern);

        menu.runMenu();
    }
}