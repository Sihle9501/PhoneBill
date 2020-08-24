package PhoneBill;

public class PhoneCall implements BillAction{

    private double price;

    public PhoneCall(double price){
        this.price = price;

    }

    @Override
    public double totalCost() {
        return price;
    }
}
