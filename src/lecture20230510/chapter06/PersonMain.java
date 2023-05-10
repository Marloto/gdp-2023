package lecture20230510.chapter06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        PersonGroup group = new PersonGroup();
        group.add(new Person("AFoo"));
        group.add(new Person("BFoo"));
        group.add(new Person("CBor"));
        for(Person p : group) { // <- 
            System.out.println(p.getName());
        }
        
        System.out.println("---");
        PersonGroupFilterIterator iterator = new PersonGroupFilterIterator(group, "Foo");
        while(iterator.hasNext()) {
            Person next = iterator.next();
            System.out.println(next.getName());
        }
        
        System.out.println("---");
        PersonGroup filteredPerson = group.filteredPerson("o");
        PersonGroup filteredPerson2 = filteredPerson.filteredPerson("F");
        for(Person p : filteredPerson2) {
            System.out.println(p.getName());
        }
        
        
        List<Person> p = new ArrayList<>();
        p.add(new Person("AFoo"));
        p.add(new Person("BFoo"));
        p.add(new Person("CBor"));
        p.sort(new AntiPersonNameComparator());
        p.sort(null); // <- sortiert nach Comparable-Schnittstelle
        // last words: sort in persongroup einbauen?
    }
}
