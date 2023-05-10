package lecture20230510.chapter06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonGroupFilterIterator implements Iterator<Person>{
    // Was ist notwendig, um über Personen
    // nach Name zu filtern und iterieren
    // -> filter / find
    // -> find Methode aufrufen
    // -> filter und elemente werden benötigt
    
    private PersonGroup group;
    private String filter;
    private List<Person> filtered;
    private int i;
    private Iterator<Person> iterator;

    public PersonGroupFilterIterator(PersonGroup group, String filter) {
        this.group = group;
        this.filter = filter;
        this.i = 0;
        this.find();
    }
    
    private void find() {
        filtered = new ArrayList<>();
        for(Person p : group) {
            if(p.getName().contains(filter)) {
                filtered.add(p);
            }
        }
        iterator = filtered.iterator();
    }

    public boolean hasNext() {
//        return this.i < this.filtered.size(); // pos überprüfen mit anzahl
        return iterator.hasNext();
    }

    public Person next() {
        // an der stelle i 
//        Person person = this.filtered.get(i);
//        this.i ++;
//        return person;
//        return filtered.get(i ++);
        return iterator.next();
    }
}
