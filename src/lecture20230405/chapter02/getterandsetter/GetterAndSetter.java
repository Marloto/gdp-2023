package lecture20230405.chapter02.getterandsetter;

public class GetterAndSetter {
    private int xyz;
    private boolean other;
    private double abc;

    public int getXyz() {
        return xyz;
    }

    public void setXyz(int xyz) {
        this.xyz = xyz;
    }

    public boolean isOther() {
        return other;
    }

    public void setOther(boolean other) {
        this.other = other;
    }

    public double getAbc() {
        return abc;
    }

    public void setAbc(double abc) {
        this.abc = abc;
    }

    // Getter: <typ> get<Name>()
    // - Ausnahme bei Boolean-Typ: <boolean> is<Name>()
    // Setter: void set<Name>(<typ> value)

    // (alternativ Properties)
    // "Lombok"
}
