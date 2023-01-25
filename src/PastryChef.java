public class PastryChef implements Runnable {
    private final PastryShop shop;

    public PastryChef(PastryShop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        //TODO
        shop.put(new Pastry());
    }
}
