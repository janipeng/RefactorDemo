package extract_subclass;

public abstract class JobItem {
    private int quantity;

    public JobItem(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return getUnitPrice() * quantity;
    }

    public abstract int getUnitPrice();
}
