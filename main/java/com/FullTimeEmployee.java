package main.java.com;

public class FullTimeEmployee extends Employee {

    double annualBonus;
    String benefits;

    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
        this.annualBonus = annualBonus;
        this.benefits = benefits;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;

    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getBenefits() {
        return benefits;
    }

    @Override
    public double CalculateMonthlyPay() {
        return baseSalary / 12 + (annualBonus / 12);
    }

    @Override
    public String getEmployeeInfo() {
        return "Full Time Employee: " + super.getEmployeeInfo() + "Annual Bonus: " + annualBonus + "Benefits: "
                + benefits;
    }
}
