public class Customer implements Runnable {
    private final PastryShop shop;

    public Customer(PastryShop shop) {
        System.out.println("I'm hungry");
        this.shop = shop;
    }

    @Override
    public void run() {
        System.out.println("customer running...");
        shop.get();
    }
}
