package remove_switch;

public class Employee {
    private static final int ENGINEER = 0;
    private static final int SALESMAN = 1;
    private static final int MANAGER = 2;
    private EmployeeType employeeType;
    private int monthlySalary;
    private int commission;
    private int bonus;

    public Employee(int type) {
        this.employeeType = createEmployeeType(type);
    }

    public EmployeeType createEmployeeType(int type) {
        switch (type) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new RuntimeException("Incorrect employee");
        }
    }

    int payAmount() {
        return this.employeeType.payAmount(this);
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getCommission() {
        return commission;
    }

    public int getBonus() {
        return bonus;
    }
}
