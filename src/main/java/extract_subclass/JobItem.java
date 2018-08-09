package extract_subclass;

public class JobItem {
    private int unitPrice;
    private int quantity;

    protected JobItem(int unitPrice, int quantity) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    int getTotalPrice() {
        return getUnitPrice() * quantity;
    }

    protected int getUnitPrice() {
        return unitPrice;
    }

}
