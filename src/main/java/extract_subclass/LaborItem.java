package extract_subclass;

public class LaborItem extends JobItem {
    public LaborItem(int unitPrice, int quantity, Employee employee, boolean isLabor) {
        super(unitPrice, quantity, employee, isLabor);
    }
}
