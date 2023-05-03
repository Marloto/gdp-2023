package lecutre20230503.chapter06.collections;

import java.util.HashSet;

public class HashSetTest extends Messwerkzeuge {
    public static void main(String[] args) {
        HashSet<Data> hashSet = new HashSet<>();
        // ---------------- Hinzufügen ----------------------------
        start();
        for (int i = 0; i < ITERATIONS; i++) {
            // Fügen Sie das Objekt dummy zum Anfang der ArrayList hinzu
            Data dummy = dummy(i);
            
        }
        stopAndPrint("Hinzufügen: %fns");

        // ------------------ Element enthalten -------------------
        start();
        for (int i = 0; i < ITERATIONS; i++) {
            Data dummy = dummy(i);
            // Prüfen Sie ob ein Element in der Menge enthalten ist
            
        }
        stopAndPrint("Element enthalten: %fns");

        // -------------- Iterieren (mit for-each) ----------------
        start();
        for (Object obj : hashSet) {
            // ... hier ist nichts zu tun, betrachten Sie jedoch das Ergebnis
            System.out.println(obj);
        }
        stopAndPrint("Iterieren (mit for-each): %fns");

        // --------------------- Löschen --------------------------
        HashSet<Object> copySet = new HashSet<>(hashSet);
        start();
        for (int i = 0; i < ITERATIONS; i++) {
            Data dummy = dummy(i);
            // Entfernen Sie das Element dummy aus der Menge
            
        }
        stopAndPrint("Löschen: %fns");
    }
}