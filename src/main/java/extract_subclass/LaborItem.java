package extract_subclass;

public class LaborItem extends JobItem {
    public LaborItem(int quantity, Employee employee) {
        super(0, quantity, true);
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }
}
