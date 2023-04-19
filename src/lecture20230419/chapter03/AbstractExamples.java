package lecture20230419.chapter03;

abstract class GeometrischesObjekt {
    public abstract double berechneUmfang();
    public abstract void doSomething();
}

abstract class Something extends GeometrischesObjekt {
    public void doSomething() {
        System.out.println("Eine Nachricht ausgeben!");
    }
}

class Quadrat extends Something {
    private double a;

    public Quadrat(double a) {
        this.a = a;
        
    }
    public double berechneUmfang() {
        return a * 4;
    }
}

class Kreis extends Something {
    private double d;
    public Kreis(double d) {
        this.d = d;
    }
    public double berechneUmfang() {
        return Math.PI * d;
    }
}

class Rechteck extends Something {
    private double a;
    private double b;
    
    public Rechteck(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public double berechneUmfang() {
        return (a + b) * 2;
    }
    
    public double getA() {
        return a;
    }
    
    public double getB() {
        return b;
    }
    
    public void setA(double a) {
        this.a = a;
    }
    
    public void setB(double b) {
        this.b = b;
    }
}


public class AbstractExamples {
    public static void main(String[] args) {
        GeometrischesObjekt geo = new Quadrat(10); //new Rechteck(2, 10);
        
        System.out.println(geo.berechneUmfang());
        
        GeometrischesObjekt[] geos = new GeometrischesObjekt[3];
        geos[0] = new Rechteck(10, 4);
        geos[1] = new Quadrat(3);
        geos[2] = new Kreis(5);
        
        for(int i = 0; i < geos.length; i ++) {
            System.out.println(geos[i].berechneUmfang());
        }
    }
}
