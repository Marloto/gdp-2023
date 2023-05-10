package lecture20230510.chapter06;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PersonGroup implements Iterable<Person> {
    List<Person> persons;

    public PersonGroup() {
        this.persons = new LinkedList<>();
    }
    
    public void add(Person p) {
        this.persons.add(p);
    }
    
    public List<Person> getPersons() {
        return persons;
    }
    
    // <- set filter
    // <- set iterator als methode
    
    public PersonGroup filteredPerson(String filter) {
        PersonGroup group = new PersonGroup();
        for(Person p : this) {
            if(p.getName().contains(filter)) {
                group.add(p);
            }
        }
        return group;
    }

    public Iterator<Person> iterator() {
        return this.persons.iterator();
    }
}
