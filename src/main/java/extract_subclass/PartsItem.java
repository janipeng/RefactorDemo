package extract_subclass;

public class PartsItem extends JobItem {
    private int unitPrice;

    public PartsItem(int unitPrice, int quantity) {
        super(quantity);
        this.unitPrice = unitPrice;
    }

    @Override
    public int getUnitPrice() {
        return unitPrice;
    }
}
