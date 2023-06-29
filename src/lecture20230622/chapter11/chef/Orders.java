package lecture20230622.chapter11.chef;

import java.util.LinkedList;
import java.util.List;

/**
 * Simple thread-safe recipe order list
 * 
 * @author seb
 *
 */
public class Orders {
    private List<Recipe> orders = new LinkedList<>();

    /**
     * Adds one recipe to your current order list, list will be sorted afterwards
     * 
     * @param r Recipe you want to add
     */
    public void add(Recipe r) {
        synchronized (orders) {
            this.orders.add(r);
            this.orders.sort((a, b) -> Long.valueOf(a.getTimeInSeconds()).compareTo(b.getTimeInSeconds()) * -1);
        }
    }

    /**
     * Removes one recipe from your current order list
     * 
     * @return Removed recipe
     */
    public Recipe get() {
        if (this.orders.size() > 0) {
            synchronized (orders) {
                if (this.orders.size() > 0) {
                    return this.orders.remove(0);
                }
            }
        }
        return null;
    }

    /**
     * Returns current size of this order list
     * 
     * @return Remaining orders
     */
    public int size() {
        return this.orders.size();
    }

}