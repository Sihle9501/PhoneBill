package PhoneBill;

public class PhoneBill{
    double total;

    public void accept(BillAction billAction){
        total += billAction.totalCost();
    }

    public double total(){
       return total;
    }
}
