package lecture20230607.chapter10;

import java.util.Comparator;
import java.util.TreeSet;

class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

public class TreeExample {
    public static void main(String[] args) {
//        TreeSet<Person> set = new TreeSet<>(new Comparator<>() {
//            public int compare(Person o1, Person o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//        TreeSet<Person> set = new TreeSet<>((Person o1, Person o2) -> {
//                return o1.getName().compareTo(o2.getName());
//        });
//        TreeSet<Person> set = new TreeSet<>((o1, o2) -> {
//            return o1.getName().compareTo(o2.getName());
//        });
//        TreeSet<Person> set = new TreeSet<>((o1, o2) -> o1.getName().compareTo(o2.getName()));
        TreeSet<Person> set = new TreeSet<>(getComparator());
        set.add(new Person("C"));
        set.add(new Person("D"));
        set.add(new Person("A"));
        set.add(new Person("B"));
        for(Person p : set) {
            System.out.println(p.getName());
        }
    }
    
    public static Comparator<Person> getComparator() {
        return (o1, o2) -> o1.getName().compareTo(o2.getName());
    }
}
