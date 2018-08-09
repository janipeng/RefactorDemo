package extract_subclass;

public class JobItem {
    private int unitPrice;
    private int quantity;
    protected Employee employee;

    protected JobItem(int unitPrice, int quantity, Employee employee) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.employee = employee;
    }

    public JobItem(int unitPrice, int quantity) {
        this(unitPrice, quantity, null);
    }

    public int getTotalPrice() {
        return getUnitPrice() * quantity;
    }

    protected int getUnitPrice() {
        return unitPrice;
    }

}
