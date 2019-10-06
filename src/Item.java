import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Item {


    private ItemName name;
    private List<Double> allBids = new ArrayList<>();

    public Item(ItemName itemName){
        this.name = itemName;
    }

    public void addBid(double amount){
        allBids.add(amount);
    }

    public double getWinningBid(){
        List<Double> tempList = new ArrayList<>(allBids);
        Collections.sort(tempList, Collections.reverseOrder());
        return tempList.get(0);
    }

    public ItemName getName(){
        return name;
    }

    public List <Double>getAllBids(){
        return allBids;
    }


    public enum ItemName {

        TV,
        CHAIR,
        MP3PLAYER;



    }
}
