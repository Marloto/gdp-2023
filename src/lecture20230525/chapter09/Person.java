package lecture20230525.chapter09;

public class Person {
    private String name;
    private String vorname;
    private String stadt;
    private String plz;
    private String strasse;

    public Person() {
    }
    
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public String getStadt() {
        return stadt;
    }

    public String getPlz() {
        return plz;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String toString() {
        return name;
    }

}
