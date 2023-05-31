package lecture20230531.chapter09.restaurant.model;

import java.util.Objects;

public class Reservation implements Comparable<Reservation> {
    private String name;
    private String date; // nicht definiert :) 00:00 - 23:59

    public Reservation(String date, String name) {
        this.date = date;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String toString() {
        return this.date + " " + this.name;
    }

    public int hashCode() {
        return Objects.hash(date, name);
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Reservation other = (Reservation) obj;
        return Objects.equals(date, other.date) && Objects.equals(name, other.name);
    }

    public int compareTo(Reservation o) {
        return date.compareTo(o.date);
    }

}
