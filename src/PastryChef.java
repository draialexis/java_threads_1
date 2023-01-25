public class PastryChef implements Runnable {
    private final PastryShop shop;

    public PastryChef(PastryShop shop) {
        System.out.println("I'm a chef");
        this.shop = shop;
    }

    @Override
    public void run() {
        System.out.println("chef running...");
        shop.put(new Pastry());
    }
}
