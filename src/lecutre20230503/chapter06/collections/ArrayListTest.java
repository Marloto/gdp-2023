package lecutre20230503.chapter06.collections;

import java.util.ArrayList;

import lecutre20230503.chapter06.collections.Messwerkzeuge.Data;

public class ArrayListTest extends Messwerkzeuge {

    public static void main(String[] args) {
        ArrayList<Data> arrayList = new ArrayList<>();
        // ---------------- Hinzufügen am Anfang ------------------
        // Hinzufügen ans Ende
        start();
        for (int i = 0; i < ITERATIONS; i++) {
            Data dummy = dummy(i);
            // Fügen Sie das Objekt dummy zum Anfang der ArrayList hinzu
            arrayList.add(dummy);
        }
        stopAndPrint("Hinzufügen am Anfang: %fns");

        // --------------- Setzen an Position ---------------------
        start();
        for (int i = 0; i < ITERATIONS; i++) {
            Data dummy = dummy(i);
            int zufallsIndex = (int) (Math.random() * arrayList.size());
            // Setzen Sie das Objekt dummy in der ArrayList and die Position zufallsIndex
            // hinzu
            arrayList.set(zufallsIndex, dummy);
        }
        stopAndPrint("Setzen an Position: %fns");

        // -------------- Letztes Element auslesen ----------------
        start();
        for (int i = 0; i < ITERATIONS; i++) {
            // Beziehen Sie das letzte Element in der ArrayList
            arrayList.get(arrayList.size() -1);
        }
        stopAndPrint("Letztes Element auslesen: %fns");

        // -------------- Iterieren (mit for-each) ----------------
        start();
        for (Data obj : arrayList) {
            // ... hier ist nichts zu tun, betrachten Sie jedoch das Ergebnis
            System.out.println(obj);
        }
        stopAndPrint("Iterieren (mit for-each): %fns");

        // --------------- Iterieren (mit for) --------------------
        start();
        for (int i = 0; i < arrayList.size(); i++) {
            // Beziehen Sie das Element in der ArrayList an der Position i
            
        }
        stopAndPrint("Iterieren (mit for): %fns");

        // --------------- Löschen vom Ende -----------------------
        ArrayList<Data> copyList = new ArrayList<>(arrayList);
        start();
        for (int i = 0; i < ITERATIONS; i++) {
            // Entfernen Sie das letzte Element
            copyList.remove(copyList.size() - 1);
        }
        stopAndPrint("Löschen vom Ende: %fns");

        // ------------- Löschen mit Position ---------------------
        copyList = new ArrayList<>(arrayList);
        start();
        for (int i = 0; i < ITERATIONS; i++) {
            int zufallsIndex = (int) (Math.random() * copyList.size());
            // Entfernen Sie das Element an Position zufallsIndex
            copyList.remove(zufallsIndex);
        }
        stopAndPrint("Löschen mit Position: %fns");
        
    }

}