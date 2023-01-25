import java.util.concurrent.ArrayBlockingQueue;

public class PastryShop extends ArrayBlockingQueue<Pastry> {

    public PastryShop(int capacity, boolean isFair) {
        super(capacity, isFair);
    }

    public void put(Pastry pastry) {
        while (this.offer(pastry)) { // fills up to max (offer -> false when full)
            System.out.println("+");
        }
    }

    public Pastry get() {
        Pastry res = null;
        try {
            res = this.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
            // trust the process to get back on track on its own..?
        }
        System.out.println("-");
        return res;
    }
}
