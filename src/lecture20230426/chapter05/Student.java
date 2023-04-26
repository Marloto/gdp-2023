package lecture20230426.chapter05;

public class Student implements Vergleicher {
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


}
