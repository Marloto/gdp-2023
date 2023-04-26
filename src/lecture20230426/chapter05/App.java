package lecture20230426.chapter05;

import java.util.Arrays;

public class App {
    
    public static void handle(Vergleicher vergleicher) {
        vergleicher.isGreaterThan(vergleicher);
        
        
        if(vergleicher  instanceof Quadrat) {
            System.out.println("ist immernoch ein Quadrat");
            Quadrat q = (Quadrat) vergleicher;
        }
    }
    
    public static void handleOther(SomeOtherInterface someOther) {
        someOther.doSomething();
    }
    
    public static void main(String[] args) {
        // Auf was kann zugewiesen werden?
        // -> Klasse selbst
        // -> Generellere Klassen
        // -> alle Schnittstellen
        Quadrat qu = new Quadrat(10);
        // unterscheiden sich die Möglichkeiten in qu
        // mit instanceof
        if(qu instanceof Vergleicher) {
            System.out.println("instanceof Vergleicher");
        }
        
        handle(qu);
        handleOther(qu);
        
        
        Quadrat[] q = new Quadrat[] {
                new Quadrat(10),
                new Quadrat(2),
                new Quadrat(4)
        }; 
        Student[] s = new Student[] {
                new Student("a", 10),
                new Student("b", 2),
                new Student("c", 4)
        }; 
        
        Bubblesort.sortiere(s);
        System.out.println(Arrays.toString(s));
    }
}
