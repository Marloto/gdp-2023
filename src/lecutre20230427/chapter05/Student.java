package lecutre20230427.chapter05;

import java.util.Arrays;

public class Student implements Vergleicher, Comparable {
    private String name;
    private int matrikelnummer;

    public Student(String name, int matrikelnummer) {
        super();
        this.name = name;
        this.matrikelnummer = matrikelnummer;
    }

    public String getName() {
        return name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public int getValue() {
        return this.matrikelnummer;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", matrikelnummer=" + matrikelnummer + "]";
    }
    

    public boolean isGreaterThan(Vergleicher vergleicher) {
        return this.matrikelnummer <= ((Student)vergleicher).matrikelnummer;
    }

    @Override
    public int compareTo(Object o) {
        // this < o ----> -1 bzw. < 0
        // this == o ---> 0
        // this > o ----> +1 bzw. > 0
        if(o == null) {
            return 1;
        }
        if(o == this) {
            return 0;
        }
        if(!(o instanceof Student)) {
            return 1;
        }
        Student other = (Student) o;
        String name1 = this.name;
        String name2 = other.name;
        
        if(name1 == null && name2 == null) {
            return Integer.valueOf(matrikelnummer).compareTo(other.matrikelnummer);
        } else if(name1 == null) {
            return -1;
        } else if(name2 == null) {
            return 1;
        }
        
//        if(name1 == null) {
//            if(name2 == null) {
//                return 0;
//            } else {
//                return 1;
//            }
//        } else {
//            if(name2 == null) {
//                return -1;
//            }
//        }
        
        // nach namen sortieren
        
        // o ist null oder nicht Student
        // kein Attribut mit name
        //  -> name null sein
        
        int compareTo = this.name.compareTo(other.name);
        
        // wenn name identisch, also == 0
        if(compareTo == 0) {
            return Integer.valueOf(matrikelnummer).compareTo(other.matrikelnummer);
        }
        
        return compareTo;
    }
    
    public static void main(String[] args) {
        Student[] s = new Student[] {
                new Student("a", 10),
                new Student("a", 2),
                new Student("c", 4)
        }; 
        
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
    }


}
