package extract_subclass;

public class LaborItem extends JobItem {
    public LaborItem(int unitPrice, int quantity, Employee employee) {
        super(unitPrice, quantity, employee);
    }

    protected int getUnitPrice() {
        return employee.getRate();
    }
}
