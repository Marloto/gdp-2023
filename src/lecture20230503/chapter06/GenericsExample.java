package lecture20230503.chapter06;

enum TuerStatus {
    ABGESCHLOSSEN, OFFEN, GESCHLOSSEN;
}

public class GenericsExample {
    public static void main(String[] args) {
        Messwert<Integer> mw = new Messwert<Integer>("test", Integer.valueOf(42));
        Integer value = mw.getValue();
        
        Messwert<TuerStatus> mw2 = new Messwert<>("test2", TuerStatus.ABGESCHLOSSEN);
        TuerStatus value2 = mw2.getValue();
    }
}
