package lecture20230420.chapter04;

public class TerminTypSelfMade {

    public static final TerminTypSelfMade UNDEFINIERT = new TerminTypSelfMade(0, "UNDEFINIERT");
    public static final TerminTypSelfMade ONLINE = new TerminTypSelfMade(1, "ONLINE");
    
    private int ordinal;
    private String name;
    
    private TerminTypSelfMade(int ordinal, String name) {
        this.ordinal = ordinal;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public int getOrdinal() {
        return ordinal;
    }
}
