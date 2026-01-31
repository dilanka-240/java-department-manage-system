package main.java.com;

public class Intern extends Employee {

    int durationInMonths;
    String mentorName;

    public Intern(int id, String name, double baseSalary, int durationInMonths, String mentorName) {
        super(id, name, baseSalary);
        this.durationInMonths = durationInMonths;
        this.mentorName = mentorName;
    }

    public int getDurationInMonths() {
        return durationInMonths;
    }

    public void setDurationInMonths(int durationInMonths) {
        this.durationInMonths = durationInMonths;
    }

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public double CalculateMonthlyPay() {
        return baseSalary / 12;
    }

    @Override
    public String getEmployeeInfo() {
        return "Intern: " + super.getEmployeeInfo() + "Duration: " + durationInMonths + "Mentor: " + mentorName;
    }
}
