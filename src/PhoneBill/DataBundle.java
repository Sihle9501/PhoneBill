package PhoneBill;

public class DataBundle implements BillAction{

    private double price;

    public DataBundle(double DataBundle) {
        if (DataBundle < 500) {
            this.price = 0.75 * DataBundle;
        } else if (DataBundle > 500)
            this.price = 0.55 * DataBundle;
        else if (DataBundle > 1000) {
            this.price = 0.35 * DataBundle;
        }
    }
    @Override
    public double totalCost() {
        return price;
    }
}