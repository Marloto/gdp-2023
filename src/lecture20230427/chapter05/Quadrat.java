package lecture20230427.chapter05;

import java.util.Arrays;

public class Quadrat implements Vergleicher, Comparable {
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

    public int compareTo(Object o) {
        // Attribute: this.seitenlaenge
        
        // this < o ----> -1 bzw. < 0
        // this == o ---> 0
        // this > o ----> +1 bzw. > 0
        
        Quadrat other= (Quadrat)o;
        
//        int value;
//        if(this.seitenlaenge < other.seitenlaenge) {
//            value = -1;
//        } else if(this.seitenlaenge == other.seitenlaenge) {
//            value = 0;
//        } else {
//            value = 1;
//        }
        
        // this / o
        // 10 / 4 --> 4 - 10
        // 2 / 4 ---> 4 -2
        
        // return this.seitenlaenge - other.seitenlaenge; // <---
        return Integer.valueOf(this.seitenlaenge).compareTo(other.seitenlaenge) * -1;
    }
    
    public static void main(String[] args) {
        Quadrat[] q = new Quadrat[] {
                new Quadrat(10),
                new Quadrat(2),
                new Quadrat(4)
        }; 
        
        Arrays.sort(q, new QuadratComparator());
        
        System.out.println(Arrays.toString(q));
        
        String[] list = new String[] {"B", "A", "C"};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        
        Double[] doubles = new Double[] {4.2, 1.0, 0.9};
        Arrays.sort(doubles);
        System.out.println(Arrays.toString(doubles));
    }
    
}















