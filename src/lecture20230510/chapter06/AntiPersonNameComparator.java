package lecture20230510.chapter06;

import java.util.Comparator;

public class AntiPersonNameComparator implements Comparator<Person> {

    public int compare(Person o1, Person o2) {
        // null o1 od. o2?
        return o1.getName().compareTo(o2.getName()) * -1;
    }

}
