package extract_subclass;

public class LaborItem extends JobItem {
    public LaborItem(int quantity, Employee employee) {
        super(0, quantity);
        this.employee = employee;
    }

    @Override
    public int getUnitPrice() {
        return employee.getRate();
    }
}
