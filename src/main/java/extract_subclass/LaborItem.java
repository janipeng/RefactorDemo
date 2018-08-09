package extract_subclass;

public class LaborItem extends JobItem {
    private Employee employee;

    LaborItem(int quantity, Employee employee) {
        super(0, quantity);
        this.employee = employee;
    }

    protected int getUnitPrice() {
        return employee.getRate();
    }
}
