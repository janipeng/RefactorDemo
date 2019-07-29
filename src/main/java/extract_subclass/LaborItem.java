package extract_subclass;

public class LaborItem extends JobItem {

    private Employee employee;

    public LaborItem(int quantity, Employee employee) {
        super(quantity);
        this.employee = employee;
    }

    @Override
    public int getUnitPrice() {
        return employee.getRate();
    }
}
