package main.java.com;

import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    Department d;
    Company c;
    FullTimeEmployee fe;
    PartTimeEmployee pe;
    Intern i;

    public Menu(Department d, Company c, FullTimeEmployee fe, PartTimeEmployee pe, Intern i) {
        this.d = d;
        this.c = c;
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
                            fe.name = scan.next();
                            System.out.println("Enter employee salary: ");
                            fe.baseSalary = scan.nextDouble();
                            System.out.println("Enter employee bonus: ");
                            fe.annualBonus = scan.nextDouble();
                            System.out.println("Enter employee benefits: ");
                            fe.benefits = scan.next();
                            d.addEmployee(fe);
                            break;
                        case 2:
                            System.out.println("Enter employee name: ");
                            pe.name = scan.next();
                            System.out.println("Enter employee salary: ");
                            pe.baseSalary = scan.nextDouble();
                            System.out.println("Enter employee hourly rate: ");
                            pe.hourlyRate = scan.nextDouble();
                            System.out.println("Enter employee hours worked: ");
                            pe.hoursWorked = scan.nextInt();
                            d.addEmployee(pe);
                            break;
                        case 3:
                            System.out.println("Enter employee name: ");
                            i.name = scan.next();
                            System.out.println("Enter employee salary: ");
                            i.baseSalary = scan.nextDouble();
                            System.out.println("Enter employee mentor name: ");
                            i.mentorName = scan.next();
                            System.out.println("Enter employee duration: ");
                            i.durationInMonths = scan.nextInt();
                            d.addEmployee(i);
                            break;

                    }
                    break;
                case 5:
                    System.out.println("Enter employee id: ");
                    int id = scan.nextInt();
                    if (id == fe.id) {
                        d.removeEmployee(fe.id);
                    } else if (id == pe.id) {
                        d.removeEmployee(pe.id);
                    } else if (id == i.id) {
                        d.removeEmployee(i.id);
                    }
                    break;
                case 6:
                    System.out.println("Enter Department name: ");
                    d.name = scan.next();
                    c.addDepartment(d);
                    break;
                case 7:
                    System.out.println("Enter department name: ");
                    d.name = scan.next();
                    c.removeDepartment(d);
                    break;
                case 8:
                    System.out.println("Enter employee id: ");
                    int id2 = scan.nextInt();
                    if (id2 == fe.id) {
                        System.out.println("Enter new titel: ");
                        fe.newTitle = scan.next();
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