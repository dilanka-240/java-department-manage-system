package main.java.com;

import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    Department d;
    Company c;
    Employee e;
    FullTimeEmployee fe;
    PartTimeEmployee pe;
    Intern i;

    public Menu(Department d, Company c, Employee e, FullTimeEmployee fe, PartTimeEmployee pe, Intern i) {
        this.d = d;
        this.c = c;
        this.e = e;
        this.fe = fe;
        this.pe = pe;
        this.i = i;
    }

    public void runMenu() {
        while (true) {
            System.out.println("**Company Menu**");
            System.out.println("1. List employees");
            System.out.println("2. List departments");
            System.out.println("3. Show payroll");
            System.out.println("4. Add employee");
            System.out.println("5. Remove employee");
            System.out.println("6. Add department");
            System.out.println("7. Remove department");
            System.out.println("8. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter department name: ");
                    d.name = scan.next();
                    d.printAllEmployees();
                    break;
                case 2:
                    System.out.println("Enter comapny name: ");
                    c.companyName = scan.next();
                    c.allDepartmentsInfo();
                    break;
                case 3:

                    d.getDepartmentSalaryTotal();
                    break;
                case 4:
                    int ch;
                    System.out.println("1. Full time employee");
                    System.out.println("2. Part time employee");
                    System.out.println("3. Intern");
                    System.out.println("Enter employee type: ");
                    ch = scan.nextInt();
                    switch (ch) {
                        case 1:
                            System.out.println("Enter employee name: ");
                            e.name = scan.next();
                            System.out.println("Enter employee salary: ");
                            e.baseSalary = scan.nextDouble();
                            System.out.println("Enter employee bonus: ");
                            fe.annualBonus = scan.nextDouble();
                            System.out.println("Enter employee benefits: ");
                            fe.benefits = scan.next();
                            d.addEmployee(e);
                            break;
                        case 2:
                            System.out.println("Enter employee name: ");
                            e.name = scan.next();
                            System.out.println("Enter employee salary: ");
                            e.baseSalary = scan.nextDouble();
                            System.out.println("Enter employee hourly rate: ");
                            pe.hourlyRate = scan.nextDouble();
                            System.out.println("Enter employee hours worked: ");
                            pe.hoursWorked = scan.nextInt();
                            d.addEmployee(e);
                            break;
                        case 3:
                            System.out.println("Enter employee name: ");
                            e.name = scan.next();
                            System.out.println("Enter employee salary: ");
                            e.baseSalary = scan.nextDouble();
                            System.out.println("Enter employee mentor name: ");
                            i.mentorName = scan.next();
                            System.out.println("Enter employee duration: ");
                            i.durationInMonths = scan.nextInt();
                            d.addEmployee(e);
                            break;

                    }
                    e.name = scan.next();
                    System.out.println("Enter employee salary: ");
                    e.baseSalary = scan.nextDouble();
                    d.addEmployee(e);
                    break;
                case 5:
                    System.out.println("Enter employee id: ");
                    e.id = scan.nextInt();
                    d.removeEmployee(e.id);
                    break;
                case 6:
                    System.out.println("Enter Department name: ");
                    d.name = scan.next();
                    System.out.println("");
                    c.addDepartment(d);
                    break;
                case 7:
                    System.out.println("Enter department name: ");
                    d.name = scan.next();
                    c.removeDepartment(d);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }
    }
}