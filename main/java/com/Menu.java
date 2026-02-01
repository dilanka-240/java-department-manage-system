package main.java.com;

import java.util.Scanner;
import java.util.List;

public class Menu {
    Scanner scan = new Scanner(System.in);
    Department d;
    Company c;
    FullTimeEmployee fe;
    PartTimeEmployee pe;
    Intern i;
    List<Department> departments;
    List<Employee> employees;

    public Menu(Department d, Company c, FullTimeEmployee fe, PartTimeEmployee pe, Intern i,
            List<Department> department, List<Employee> employees) {
        this.d = d;
        this.c = c;
        this.fe = fe;
        this.pe = pe;
        this.i = i;
        this.departments = department;
        this.employees = employees;
    }

    public void runMenu() {
        while (true) {
            System.out.println("\n**Company Menu**");
            System.out.println("1. List employees");
            System.out.println("2. List departments");
            System.out.println("3. Show payroll");
            System.out.println("4. Add employee");
            System.out.println("5. Remove employee");
            System.out.println("6. Add department");
            System.out.println("7. Remove department");
            System.out.println("8. Give a promote to employee");
            System.out.println("9. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    d.printAllEmployees();
                    break;
                case 2:
                    c.allDepartmentsInfo();
                    break;
                case 3:
                    int ch2;
                    System.out.println("\n1. Employee");
                    System.out.println("2. Department");
                    System.out.print("\nEnter your choice: ");
                    ch2 = scan.nextInt();
                    scan.nextLine();
                    switch (ch2) {
                        case 1:
                            System.out.print("\nEnter employee id: ");
                            int id3 = scan.nextInt();
                            scan.nextLine();
                            if (id3 == fe.id) {
                                System.out.println("Salary: " + fe.CalculateMonthlyPay());
                            } else if (id3 == pe.id) {
                                System.out.println("Salary: " + pe.CalculateMonthlyPay());
                            } else if (id3 == i.id) {
                                System.out.println("Salary: " + i.CalculateMonthlyPay());
                            }
                            break;
                        case 2:
                            System.out.print("\nEnter department name: ");
                            d.name = scan.nextLine();
                            System.out.println("Total Salary: " + d.getDepartmentSalaryTotal());
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }

                    break;
                case 4:
                    int ch;
                    System.out.println("\n1. Full time employee");
                    System.out.println("2. Part time employee");
                    System.out.println("3. Intern");
                    System.out.print("\nEnter employee type: ");
                    ch = scan.nextInt();
                    scan.nextLine();
                    switch (ch) {
                        case 1:
                            System.out.print("\nEnter employee name: ");
                            String name = scan.nextLine();
                            System.out.print("\nEnter employee salary: ");
                            double baseSalary = scan.nextDouble();
                            System.out.print("\nEnter employee bonus: ");
                            double annualBonus = scan.nextDouble();
                            scan.nextLine();
                            System.out.print("\nEnter employee benefits: ");
                            String benefits = scan.nextLine();
                            FullTimeEmployee fe = new FullTimeEmployee();
                            fe.name = name;
                            fe.baseSalary = baseSalary;
                            fe.annualBonus = annualBonus;
                            fe.benefits = benefits;
                            System.out.print("\nEnter the department of the employee: ");
                            d.name = scan.nextLine();
                            d.setEmployees(employees);
                            d.addEmployee(fe);
                            break;
                        case 2:
                            System.out.print("\nEnter employee name: ");
                            String name2 = scan.nextLine();
                            System.out.print("\nEnter employee salary: ");
                            double baseSalary2 = scan.nextDouble();
                            System.out.print("\nEnter employee hourly rate: ");
                            double hourlyRate = scan.nextDouble();
                            System.out.print("\nEnter employee hours worked: ");
                            int hoursWorked = scan.nextInt();
                            scan.nextLine();
                            PartTimeEmployee pe = new PartTimeEmployee();
                            pe.name = name2;
                            pe.baseSalary = baseSalary2;
                            pe.hourlyRate = hourlyRate;
                            pe.hoursWorked = hoursWorked;
                            System.out.println("Enter the department of the employee: ");
                            d.name = scan.nextLine();
                            d.setEmployees(employees);
                            d.addEmployee(pe);
                            break;
                        case 3:
                            System.out.print("\nEnter employee name: ");
                            String name3 = scan.nextLine();
                            System.out.print("\nEnter employee salary: ");
                            double baseSalary3 = scan.nextDouble();
                            System.out.print("\nEnter employee mentor name: ");
                            String mentorName = scan.next();
                            System.out.print("\nEnter employee duration: ");
                            int durationInMonths = scan.nextInt();
                            scan.nextLine();
                            Intern i = new Intern();
                            i.name = name3;
                            i.baseSalary = baseSalary3;
                            i.mentorName = mentorName;
                            i.durationInMonths = durationInMonths;
                            System.out.println("Enter the department of the employee: ");
                            d.name = scan.nextLine();
                            d.setEmployees(employees);
                            d.addEmployee(i);
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;

                    }
                    break;
                case 5:
                    System.out.print("\nEnter employee id: ");
                    int id = scan.nextInt();
                    scan.nextLine();
                    Employee re = null;
                    for (Employee e : employees) {
                        if (e.id == id) {
                            re = e;
                            break;
                        }
                    }
                    if (re != null) {
                        employees.remove(id);
                        System.out.println("Employee removed successfully");
                    } else {
                        System.out.println("Employee not found");
                    }
                    break;
                case 6:
                    scan.nextLine();
                    System.out.print("\nEnter Department name: ");
                    String name = scan.nextLine();
                    Department nd = new Department();
                    nd.name = name;
                    c.addDepartment(nd);
                    break;
                case 7:
                    scan.nextLine();
                    System.out.print("\nEnter department name: ");
                    d.name = scan.nextLine();
                    c.removeDepartment(d);
                    break;
                case 8:
                    System.out.print("\nEnter employee id: ");
                    int id2 = scan.nextInt();
                    scan.nextLine();
                    if (id2 == fe.id) {
                        System.out.print("Enter new titel: ");
                        fe.newTitle = scan.nextLine();
                        fe.promote(fe.newTitle);
                    } else {
                        System.out.println("Employer need to be full time employee");
                    }
                    break;
                case 9:
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