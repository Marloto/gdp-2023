package lecutre20230503.chapter06.collections;

import java.util.LinkedList;

public class LinkedListTest extends Messwerkzeuge {

    public static void main(String[] args) {
        LinkedList<Data> linkedList = new LinkedList<>();
        // ---------------- Hinzufügen am Anfang ------------------
        // Hinzufügen ans Ende
        start();
        for (int i = 0; i < ITERATIONS; i++) {
            Data dummy = dummy(i);
            // Fügen Sie das Objekt dummy zum Anfang der ArrayList hinzu
            linkedList.add(dummy);
        }
        stopAndPrint("Hinzufügen am Anfang: %fns");

        // --------------- Setzen an Position ---------------------
        start();
        for (int i = 0; i < ITERATIONS; i++) {
            Data dummy = dummy(i);
            int zufallsIndex = (int) (Math.random() * linkedList.size());
            // Setzen Sie das Objekt dummy in der ArrayList and die Position zufallsIndex
            // hinzu
            linkedList.set(zufallsIndex, dummy);
        }
        stopAndPrint("Setzen an Position: %fns");

        // -------------- Letztes Element auslesen ----------------
        start();
        for (int i = 0; i < ITERATIONS; i++) {
            // Beziehen Sie das letzte Element in der ArrayList
            Data last = linkedList.getLast();
        }
        stopAndPrint("Letztes Element auslesen: %fns");

        // -------------- Iterieren (mit for-each) ----------------
        start();
        for (Data obj : linkedList) {
            // ... hier ist nichts zu tun
        }
        stopAndPrint("Iterieren (mit for-each): %fns");

        // --------------- Iterieren (mit for) --------------------
        start();
        for (int i = 0; i < linkedList.size(); i++) {
            // Beziehen Sie das Element in der ArrayList an der Position i
            Data data = linkedList.get(i);
        }
        stopAndPrint("Iterieren (mit for): %fns");

        // --------------- Löschen vom Ende -----------------------
        LinkedList<Data> copyList = new LinkedList<>(linkedList);
        start();
        for (int i = 0; i < ITERATIONS; i++) {
            // Entfernen Sie das letzte Element
            copyList.removeLast();
        }
        stopAndPrint("Löschen vom Ende: %fns");

        // ------------- Löschen mit Position ---------------------
        copyList = new LinkedList<>(linkedList);
        start();
        for (int i = 0; i < ITERATIONS; i++) {
            int zufallsIndex = (int) (Math.random() * copyList.size());
            // Entfernen Sie das Element an Position zufallsIndex
            copyList.remove(zufallsIndex);
        }
        stopAndPrint("Löschen mit Position: %fns");
    }
}