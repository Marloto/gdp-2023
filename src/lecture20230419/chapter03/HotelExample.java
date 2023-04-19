package lecture20230419.chapter03;

class Unterkunft {
    private Adresse adresse;
    private Zimmer[] zimmer;
    
    public Unterkunft(int zahl) {
        this.zimmer = new Zimmer[zahl];
        
        for(int i = 0; i < zahl; i ++) {
            this.zimmer[i] = new Zimmer();
        }
    }

    public Adresse getAdresse() {
        return adresse;
    }

    protected Zimmer[] getZimmer() {
        return zimmer;
    }

    public String toString() {
        return "Anzahl der Zimmer: " + this.getZimmer().length;
    }
}

class Hotel extends Motel {
    private Restaurant restaurant;
    
    public Hotel(int zahl) {
        super(zahl);
        this.restaurant = new Restaurant();
    }
    
    public String toString() {
        String res = super.toString();
        return "Hotel hat die " + res;
    }
}

class Motel extends Unterkunft {
    
    public Motel(int zahl) {
        super(zahl);
    }
    
    public String toString() {
        String res = super.toString();
        return "Motel hat die " + res;
    }
}

class Adresse {

}

class Restaurant {

}

class Zimmer {

}

public class HotelExample {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(3);
        System.out.println(hotel.toString());
    }
}
