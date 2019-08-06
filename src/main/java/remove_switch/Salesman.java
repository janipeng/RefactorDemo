package remove_switch;

public class Salesman extends EmployeeType {
    public int payAmount(Employee employee) {
        return employee.getMonthlySalary() + employee.getCommission();
    }
}
