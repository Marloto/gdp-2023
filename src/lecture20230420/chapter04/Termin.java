package lecture20230420.chapter04;

public class Termin {
    private TerminTyp typ;
    
    public TerminTyp getTyp() {
        return typ;
    }
    
    public void setTyp(TerminTyp typ) {
        this.typ = typ;
    }
    
    public Termin(TerminTyp typ) {
        this.typ = typ;
    }
}
