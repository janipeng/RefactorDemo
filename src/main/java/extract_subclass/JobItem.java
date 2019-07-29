package extract_subclass;

public class JobItem {
    private int unitPrice;
    private int quantity;
    protected Employee employee;
    private boolean isLabor;

    protected JobItem(int unitPrice, int quantity, Employee employee, boolean isLabor) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.employee = employee;
        this.isLabor = isLabor;
    }

    public JobItem(int unitPrice, int quantity) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public int getTotalPrice(){
        return getUnitPrice() * quantity;
    }

    private int getUnitPrice() {
        return isLabor ? employee.getRate() : unitPrice;
    }
}
