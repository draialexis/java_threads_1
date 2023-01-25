public class Main {
    public static void main(String[] args) {
        PastryShop shop = new PastryShop();

        Thread producer1 = new Thread(new PastryChef(shop));
        Thread consumer1 = new Thread(new Customer(shop));
        Thread consumer2 = new Thread(new Customer(shop));
        Thread consumer3 = new Thread(new Customer(shop));

        producer1.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();

    }
}
