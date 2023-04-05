package lecture20230330.chapter02.equals;

public class Kreis {
    private double durchmesser;
    
    public Kreis(double durchmesser) {
        this.durchmesser = durchmesser;
    }
    
    public boolean equals(Object obj) {
        Kreis kreis = (Kreis) obj;
        return this.durchmesser == kreis.durchmesser;
    }

    public String toString() {
        return "Kreis [durchmesser=" + durchmesser + "]";
    }
    
    public static void main(String[] args) {
        Kreis a = new Kreis(2.0);
        Kreis b = new Kreis(2.0);
        
        if(a.equals(b)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
