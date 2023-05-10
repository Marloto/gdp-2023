package lecture20230510.chapter06;

public class Person implements Comparable<Person> {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Person o) {
        if(o == null) {
            return -1;
        }
        String n1 = this.name;
        String n2 = o.getName();
        return n1.compareTo(n2);
    }
}
