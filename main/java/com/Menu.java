package main.java.com;

import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    Department d;
    Company c;
    Employee e;

    public Menu(Department d, Company c, Employee e) {
        this.d = d;
        this.c = c;
        this.e = e;
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
                    d.printAllEmployees();
                    break;
                case 2:
                    c.allDepartmentsInfo();
                    break;
                case 3:
                    d.getDepartmentSalaryTotal();
                    break;
                case 4:
                    break;
                case 5:
                    d.removeEmployee(e.id);
                    break;
                case 6:
                    c.addDepartment(d);
                    break;
                case 7:
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