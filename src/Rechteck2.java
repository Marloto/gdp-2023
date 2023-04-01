
public class Rechteck2 {
    double hoehe;
    double breite;
    
    public Rechteck2(double hoehe, double b) {
        this.hoehe = hoehe;
        this.breite = b;
    }
    
    public boolean equals(Object obj) {
        Rechteck2 r = (Rechteck2) obj;
        return this.hoehe == r.hoehe && this.breite == r.breite;
    }
    
    // Ergänzen Sie eine Methode equals zur Prüfung auf Gleichheit
    // Ergänzen Sie eine Methode toString
}
