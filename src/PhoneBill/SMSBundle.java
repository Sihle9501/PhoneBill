package PhoneBill;

public class SMSBundle implements BillAction{

    private int qty;
    private double price;

    public SMSBundle(int qty, double price){
        this.qty = qty;
        this.price = this.qty * price;
    }

    @Override
    public double totalCost() {
        return price;
    }
}
