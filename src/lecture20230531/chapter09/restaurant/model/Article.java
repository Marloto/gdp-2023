package lecture20230531.chapter09.restaurant.model;

import java.util.Objects;

public class Article {
    private String name;
    private double price;

    public Article(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + " " + this.price + " €";
    }

    public int hashCode() {
        return Objects.hash(name);
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Article other = (Article) obj;
        return Objects.equals(name, other.name);
    }

}