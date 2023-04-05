package lecture20230330.chapter02.equals;

public class Rechteck {
    double hoehe;
    double breite;
    
    public Rechteck(double hoehe, double b) {
        this.hoehe = hoehe;
        this.breite = b;
    }
    
    public boolean equals(Object obj) {
        Rechteck r = (Rechteck) obj;
        return this.hoehe == r.hoehe && this.breite == r.breite;
    }
    
    // Ergänzen Sie eine Methode equals zur Prüfung auf Gleichheit
    // Ergänzen Sie eine Methode toString
}
