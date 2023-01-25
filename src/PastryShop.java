import java.util.ArrayList;
import java.util.Arrays;

public class PastryShop extends ArrayList<Pastry> {
    private static final int MAX_STOCK_SIZE = 20;

    public synchronized void put(Pastry pastry) {
        while (getStock() == MAX_STOCK_SIZE) {
            try {
                System.out.println(getStock() + " pastries, producer blocked");
                this.wait();
            } catch (InterruptedException ex) {
                // TODO what else can we do here?
                System.err.println(Arrays.toString(ex.getStackTrace()));
            }
        }
        while (getStock() < MAX_STOCK_SIZE) {
            this.add(pastry);
            System.out.println("A Pastry was put in the shop -- " + getStock() + " remaining");

            this.notify();
        }
    }

    public synchronized Pastry get() {
        while (getStock() == 0) {
            try {
                System.out.println(getStock() + " pastries, consumer blocked");
                this.wait();
            } catch (InterruptedException ex) {
                // TODO what else can we do here?
                System.err.println(Arrays.toString(ex.getStackTrace()));
            }

        }

        Pastry res = this.get(0);
        this.remove(res);
        System.out.println("A Pastry was got from the shop -- " + getStock() + " remaining");

        this.notify();

        return res;
    }

    public int getStock() {
        return this.size();
    }

    public synchronized void prime() {
        this.notify();
    }
}
