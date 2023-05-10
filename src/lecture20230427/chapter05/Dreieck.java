package lecture20230427.chapter05;

public class Dreieck implements GeometrischesObjekt {
    private double a, b, c;

    public Dreieck(double a, double b, double c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double berechneUmfang() {
        return a + b + c;
    }
    
    public int compareTo(Object o) {
        Dreieck other = (Dreieck)o;
        return Double.valueOf(this.berechneUmfang())
                .compareTo(other.berechneUmfang());
    }
}
