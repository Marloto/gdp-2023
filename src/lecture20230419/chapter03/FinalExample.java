package lecture20230419.chapter03;

class Person {
    public final static String SOME_CONSTANT = "";
    
//    static {
//        SOME_CONSTANT = "";
//    }
    
    
    private final String name; // final-Attribute müssen im Konstruktor initialisiert werden, danach sind keine zuweisungen
    // mehr möglich, auch nicht im Konstruktor
    
    public Person(final String name) {
        // name = "..."; <- nicht veränderbarer Parameter
        this.name = name;
    }
    
    public final String getName() {
        return name;
    }
    
//    public void setName(String name) {
//        this.name = name;
//    }
//    funktioniert nicht, weil attribut final!
    public String toString() {
        final String result = "Person: " + name;
        // result = "..."; <- finale Variablen können nicht verändert werden
        return result;
    }
}

final class Student extends Person {
    public Student(String name) {
        super(name);
    }
    
    // Geht nicht, finale Methoden können nicht überschrieben werden
//    public String getName() {
//        return "";
//    }
}

// Klassen die final markiert sind, können nicht weiter spezialisiert werden
//class ExmatrikulierterStudent extends Student {
//    
//}

public class FinalExample {
    public static void main(String[] args) {
        final Student s = new Student("Test");
        s.getName();
//        s.setName("...");
    }
}
