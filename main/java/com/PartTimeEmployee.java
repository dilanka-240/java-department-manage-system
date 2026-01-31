package main.java.com;

public class PartTimeEmployee extends Employee {

    int hoursWorked;
    double hourlyRate;

    public PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double CalculateMonthlyPay() {
        return hoursWorked * hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String getEmployeeInfo() {
        return "Part Time Employee: " + super.getEmployeeInfo() + "Hours Worked: " + hoursWorked + "Hourly Rate: "
                + hourlyRate;
    }

}
