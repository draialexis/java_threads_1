import java.util.ArrayList;
import java.util.List;

public class PastryShop {
    private final List<Pastry> stock = new ArrayList<>();

    int head = 0, tail = 0; // probably wrong

    public boolean put(Pastry pastry) {
        //TODO
        stock.add(tail, pastry);
        return true;
    }

    public Pastry get() {
        //TODO
        return stock.get(head);
    }

    public int getStock() {
        return stock.size();
    }
}
