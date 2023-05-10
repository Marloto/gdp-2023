package lecture20230427.chapter05;

public class Kreis implements GeometrischesObjekt {
    private double d;

    public Kreis(double d) {
        this.d = d;
    }
    
    public double getD() {
        return d;
    }

    public double berechneUmfang() {
        return Math.PI * d;
    }

    public int compareTo(Object o) {
        Kreis other = (Kreis)o;
        return Double.valueOf(this.berechneUmfang())
                .compareTo(other.berechneUmfang());
        //return this.d - other.d; // 0.1 - 0.2 -> (int)-0.1 -> 0
    }
}
