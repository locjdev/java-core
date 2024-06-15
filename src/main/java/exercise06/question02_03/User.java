package exercise06.question02_03;

public abstract class User {
    private String name;
    private double salaryRatio;

    // Constructor
    public User(String name, double salaryRatio) {
        this.name = name;
        this.salaryRatio = salaryRatio;
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for salary ratio
    public double getSalaryRatio() {
        return salaryRatio;
    }

    public void setSalaryRatio(double salaryRatio) {
        this.salaryRatio = salaryRatio;
    }

    // Abstract method to calculate pay
    public abstract double calculatePay();

    // Method to display information
    public void displayInfor() {
        System.out.println("Name: " + name);
        System.out.println("Salary Ratio: " + salaryRatio);
        System.out.println("Pay: " + calculatePay());
    }
}

