package lecture20230420.chapter04;

public enum TerminTyp {
    UNDEFINIERT(5), ONLINE(30), TELEFON(10), CHAT(15), PRAESENZ(60), VR(30);
    
    private int defaultDauer;

    private TerminTyp(int defaultDauer) {
        this.defaultDauer = defaultDauer;
    }
    
    public int getDefaultDauer() {
        return defaultDauer;
    }
    
    public String toString() {
        return super.toString();
    }
}
