package lecture20230531.chapter09.restaurant;

import lecture20230531.chapter09.restaurant.model.Article;
import lecture20230531.chapter09.restaurant.model.Reservation;
import lecture20230531.chapter09.restaurant.model.Table;

public class ModelExample {
    public static void main(String[] args) {
        Article art1 = new Article("ProduktA", 10.00);
        Article art2 = new Article("ProduktB", 5.00);
        Table table = new Table(1);
        table.addReservation(new Reservation("10:00", "A"));
        table.addReservation(new Reservation("20:00", "B"));
        table.addToBill(art1);
        table.addToBill(art2);
        table.addToBill(art2);
        
        for(Reservation r: table.getReservations()) {
            System.out.println(r);
        }
        for(Article a: table.getArticle()) {
            System.out.println(a + ":" + table.getArticleCount(a));
        }
    }
}
