public class Application {

    public static void main(String[] args) {

        AuctionService auctionService = new AuctionService();
        auctionService.registerUser("TestUser");

    }
}
