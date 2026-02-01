import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Menu {
    Scanner scan = new Scanner(System.in);
    Company c;
    List<Department> departments;
    List<Employee> employees;
    int nextId = 1;

    public Menu(Company c) {
        this.c = c;
        this.departments = c.departments;
        this.employees = new ArrayList<>();
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
            scan.nextLine(); 

            switch (choice) {
                case 1:
                    if (employees.isEmpty()) {
                        System.out.println("No employees to display.");
                    } else {
                        for (Department d : departments) {
                            d.printAllEmployees();
                        }
                    }
                    break;
                case 2:
                    if (departments.isEmpty()) {
                        System.out.println("No departments to display.");
                    } else {
                        c.allDepartmentsInfo();
                    }
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
                            Employee emp = findEmployeeById(id3);
                            if (emp != null) {
                                System.out.println("Salary: " + emp.CalculateMonthlyPay());
                            } else {
                                System.out.println("Employee not found");
                            }
                            break;
                        case 2:
                            System.out.print("\nEnter department name: ");
                            String deptName = scan.nextLine();
                            Department dept = findDepartmentByName(deptName);
                            if (dept != null) {
                                System.out.println(dept.getDepartmentSalaryTotal());
                            } else {
                                System.out.println("Department not found");
                            }
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

                    System.out.print("\nEnter employee name: ");
                    String name = scan.nextLine();
                    System.out.print("\nEnter employee salary: ");
                    double baseSalary = scan.nextDouble();
                    scan.nextLine();

                    System.out.print("\nEnter the department of the employee: ");
                    String departmentName = scan.nextLine();
                    Department targetDepartment = findDepartmentByName(departmentName);
                    if (targetDepartment == null) {
                        System.out.println("Department not found");
                        break;
                    }

                    switch (ch) {
                        case 1:
                            System.out.print("\nEnter employee bonus: ");
                            double annualBonus = scan.nextDouble();
                            scan.nextLine();
                            System.out.print("\nEnter employee benefits: ");
                            String benefits = scan.nextLine();
                            FullTimeEmployee fe = new FullTimeEmployee(nextId++, name, baseSalary, annualBonus, benefits);
                            targetDepartment.addEmployee(fe);
                            employees.add(fe);
                            break;
                        case 2:
                            System.out.print("\nEnter employee hourly rate: ");
                            double hourlyRate = scan.nextDouble();
                            System.out.print("\nEnter employee hours worked: ");
                            int hoursWorked = scan.nextInt();
                            scan.nextLine();
                            PartTimeEmployee pe = new PartTimeEmployee(nextId++, name, baseSalary, hoursWorked, hourlyRate);
                            targetDepartment.addEmployee(pe);
                            employees.add(pe);
                            break;
                        case 3:
                            System.out.print("\nEnter employee mentor name: ");
                            String mentorName = scan.next();
                            System.out.print("\nEnter employee duration: ");
                            int durationInMonths = scan.nextInt();
                            scan.nextLine();
                            Intern i = new Intern(nextId++, name, baseSalary, durationInMonths, mentorName);
                            targetDepartment.addEmployee(i);
                            employees.add(i);
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
                    Employee re = findEmployeeById(id);

                    if (re != null) {
                        for (Department d : departments) {
                            d.getEmployees().remove(re);
                        }
                        employees.remove(re);
                        System.out.println("Employee removed successfully");
                    } else {
                        System.out.println("Employee not found");
                    }
                    break;
                case 6:
                    System.out.print("\nEnter Department name: ");
                    String newDeptName = scan.nextLine();
                    Department nd = new Department(newDeptName, new ArrayList<>());
                    c.addDepartment(nd);
                    break;
                case 7:
                    System.out.print("\nEnter department name: ");
                    String deptNameToRemove = scan.nextLine();
                    Department deptToRemove = findDepartmentByName(deptNameToRemove);
                    if (deptToRemove != null) {
                        c.removeDepartment(deptToRemove);
                    } else {
                        System.out.println("Department not found");
                    }
                    break;
                case 8:
                    System.out.print("\nEnter employee id: ");
                    int id2 = scan.nextInt();
                    scan.nextLine();
                    Employee empToPromote = findEmployeeById(id2);
                    if (empToPromote instanceof FullTimeEmployee) {
                        System.out.print("Enter new titel: ");
                        String newTitle = scan.nextLine();
                        ((FullTimeEmployee) empToPromote).promote(newTitle);
                    } else {
                        System.out.println("Employee need to be full time employee");
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
    
    private Employee findEmployeeById(int id) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    private Department findDepartmentByName(String name) {
        for (Department d : departments) {
            if (d.getName().equalsIgnoreCase(name)) {
                return d;
            }
        }
        return null;
    }
}