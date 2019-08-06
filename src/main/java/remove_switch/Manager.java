package remove_switch;

public class Manager extends EmployeeType {
    public int payAmount(Employee employee) {
        return employee.getMonthlySalary() + employee.getBonus();
    }
}
