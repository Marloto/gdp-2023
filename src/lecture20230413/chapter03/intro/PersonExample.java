package lecture20230413.chapter03.intro;

class Adresse {
    
}

class Person {
    protected String name;
    // Aggregation eines Adress-Objekts
    private Adresse adresse;

    public Person(String name) {
        this.name = name;
    }

    public Adresse getAdresse() {
        return adresse;
    }
}

// Student erbt von Person
class Student extends Person {
    private int matrikelnummer;
    
    public Student(String name) {
        super(name);
    }

    public void doSomething() {
        this.name = "Test";
    }
}

public class PersonExample {
    public static void main(String[] args) {
        new Student("Test").doSomething();
    }
}
