package lecture20230426.chapter05;

public class Quadrat implements Vergleicher, SomeOtherInterface {
    private int seitenlaenge;

    public Quadrat(int seitenlaenge) {
        super();
        this.seitenlaenge = seitenlaenge;
    }

    public int getSeitenlaenge() {
        return seitenlaenge;
    }
    
    public int getValue() {
        return seitenlaenge;
    }

    @Override
    public String toString() {
        return "Quadrat [seitenlaenge=" + seitenlaenge + "]";
    }
    
    public boolean isGreaterThan(Vergleicher vergleicher) {
        return this.seitenlaenge > ((Quadrat)vergleicher).seitenlaenge;
    }

    public void doSomething() {
        System.out.println("Hello, World!");
    }
    
}















