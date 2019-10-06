public class Bid {

    private Item item;
    private double amount;

    public  Bid(Item item, double amount){
        this.item = item;
        this.amount = amount;
    }


    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
