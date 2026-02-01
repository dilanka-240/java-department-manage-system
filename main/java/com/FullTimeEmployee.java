public class FullTimeEmployee extends Employee implements Promotable {

    double annualBonus;
    String benefits;
    String newTitle;

    public FullTimeEmployee() {
        this.id = 0;
        this.name = "";
        this.baseSalary = 0;
        this.annualBonus = 0;
        this.benefits = "";
    }

    public FullTimeEmployee(int id, String name, double baseSalary, double annualBonus, String benefits) {
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
        return "Full Time Employee: " + super.getEmployeeInfo() + " Title: " + newTitle + " Annual Bonus: "
                + annualBonus + " Benefits: " + benefits;
    }

    @Override
    public void promote(String newTitle) {
        this.newTitle = newTitle;
        System.out.println("Employee promoted to: " + newTitle);
    }

    public String getNewTitle() {
        return newTitle;
    }

    public void setNewTitle(String newTitle) {
        this.newTitle = newTitle;
    }
}
