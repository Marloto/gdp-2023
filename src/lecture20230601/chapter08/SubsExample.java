package lecture20230601.chapter08;


interface A {}

interface B extends A {}

class Vermoegen implements Comparable<Vermoegen> {
    public int compareTo(Vermoegen o) {
        return 0;
    }
}

class Bankkonto extends Vermoegen implements A {}

class Wertpapier extends Vermoegen implements B  {}

class Immobilie extends Vermoegen {}

class Sparkonto extends Bankkonto {}

class Girokonto extends Bankkonto {}

class Optionsschein extends Wertpapier {}

class Aktie extends Wertpapier {}

public class SubsExample {
    public static void main(String[] args) {
        Bankkonto[] list = new Bankkonto[] { new Sparkonto(), new Girokonto() };
        
        Vermoegen[] list2 = list;
    }
}
