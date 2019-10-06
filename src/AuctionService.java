import java.util.*;

public class AuctionService {

    // All users and item they have bid on
    Map<String, Set<Item.ItemName>> allUserBids = new HashMap<>();

    // All items we have existing in auction
    List<Item> allItems = new ArrayList<>();



    //Adds items to auction
    public AuctionService(){
        allItems.add(new Item(Item.ItemName.TV));
        allItems.add(new Item(Item.ItemName.CHAIR));
        allItems.add(new Item(Item.ItemName.MP3PLAYER));
    }

    /**
     * Record a bid for a specifid user and item
     * @param userId userId of user placing bid
     * @param bidItem The item to bid on
     * @param amount amount to bid
     */

    public void recordBid (String userId, Item.ItemName bidItem, double amount){

            for (Item item : allItems){
                if (item.getName().equals(bidItem)){
                    item.addBid(amount);
                }
            }

            Set<Item.ItemName> userItems = allUserBids.get(userId);
            if (!userItems.contains(bidItem)){
                userItems.add(bidItem);
            }

        }

        public Set<Item.ItemName> getAllUserItemsBids(String userId){
            return allUserBids.get(userId);
        }






    public void registerUser (String userId){
        allUserBids.put(userId, new HashSet<>());
    }

}


