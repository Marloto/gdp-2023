package lecture20230330.chapter02.statics;

public class StaticExample {
    private static int x = 42;
    
    private static void doOtherthing() {
        
    }
    
    private void doSomething() {

    }
    
    // Main-Methoden sind einfache Statische Methoden, gelten als Einstieg
    // könnten aber auch von wo anders aus aufgerufen werden
    public static void main(String[] args) {
        StaticExample example = new StaticExample();
        example.doSomething();
        
        StaticExample.doOtherthing();
        
        // System ist Klasse
        // out ist Attribut, statisch, in System
        // out hat Datentyp (PrintStream) und das Objekt kann die 
        //     Methode println() aufrufen
        System.out.println();
        
    }
}
