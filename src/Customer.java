public class Customer implements Runnable {
    private final PastryShop shop;

    public Customer(PastryShop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        //TODO
        shop.get();
    }
}
