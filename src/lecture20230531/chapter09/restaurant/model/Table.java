package lecture20230531.chapter09.restaurant.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class Table {
    private Collection<Reservation> reservations;
    private Map<Article, Integer> bill;
    private int nr;

    public Table(int nr) {
        this.nr = nr;
        this.reservations = new TreeSet<>();
        this.bill = new HashMap<>();
    }

    public int getNr() {
        return nr;
    }

    public String toString() {
        return "Table #" + this.nr;
    }

    public void addReservation(Reservation res) {
        this.reservations.add(res);
    }
    
    public Iterable<Reservation> getReservations() {
        return this.reservations;
    }
    public Iterable<Article> getArticle() {
        return this.bill.keySet();
    }
    
    public void addToBill(Article art) {
        int count = 0;
        if (this.bill.containsKey(art)) {
            count = bill.get(art);
        }
        bill.put(art, count + 1);
    }

    public int getArticleCount(Article article) {
        if (this.bill.containsKey(article)) {
            return this.bill.get(article);
        }
        return 0;
    }

    public Iterator<Article> iterator() {
        return null;
    }
}
