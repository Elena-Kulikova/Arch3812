package Arch3812.CarApp.CarApp.SOLID.SRP;

public class CalculateSalary {
    private Employee employee;
    private int baseSalary;

    public CalculateSalary(Employee employee, int baseSalary) {
        this.employee = employee;
        this.baseSalary = baseSalary;
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25); //calculate in otherway
        return baseSalary - tax;
    }
    
}
