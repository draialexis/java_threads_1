public class Main {
    public static void main(String[] args) {
        boolean isFair = false;
        PastryShop shop = new PastryShop(20, isFair);

        new Thread(new PastryChef(shop)).start();
        new Thread(new PastryChef(shop)).start();
        new Thread(new PastryChef(shop)).start();

        int c = 1;
        while(c++ < 110) {
            new Thread(new Customer(shop)).start();
        }

        new Thread(new PastryChef(shop)).start();
        new Thread(new PastryChef(shop)).start();

        System.out.println(c + " customers made");

    }
}
