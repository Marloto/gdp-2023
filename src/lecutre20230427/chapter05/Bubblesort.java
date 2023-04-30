package lecutre20230427.chapter05;

public class Bubblesort {
    // Vorschlag: sortiermethode mit Liste und Feldbezeichner
    // -> Object als List-Typ zzgl. instanceof
    //    if((list[i] instanceof Student && ((Student)list[i]).getMatrikelnummer() > ((Student)list[i + 1]).getMatrikelnummer()) || 
    //        list[i] instanceof Quadrat && ((Quadrat)list[i]).getSeitenlaenge() > ((Quadrat)list[i + 1]).getSeitenlaenge()) {
    // -> getValue in jedem Objekt
    public static void sortiere(Vergleicher[] list) {
        boolean getauscht = true;

        if (list.length <= 1)
            return;

        while (getauscht) {
            getauscht = false;
            for (int i = 0; i < list.length - 1; ++i) {
                // Was könnten wir verbessern, um die Sortierung
                // allgemeiner über die Schnittstelle zu steuern?
                // -> z.B. sortierfolge umdrehen
                // -> z.B. nach namen sortieren, usw.
                if(list[i].isGreaterThan(list[i + 1])) {
                    Vergleicher tmp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = tmp;
                    getauscht = true;
                }
            }
        }
    }
    
    /**
     * Sortiert "studenten" aufsteigend gemäß Bubblesort-Verfahren. Sortiert nach
     * Matrikelnummer.
     */
    public static void sortiereStudenten(Student[] studenten) {
        boolean getauscht = true;

        if (studenten.length <= 1)
            return;

        while (getauscht) {
            getauscht = false;
            for (int i = 0; i < studenten.length - 1; ++i) {
                if (studenten[i].getMatrikelnummer() > studenten[i + 1].getMatrikelnummer()) {
                    Student tmp = studenten[i];
                    studenten[i] = studenten[i + 1];
                    studenten[i + 1] = tmp;
                    getauscht = true;
                }
            }
        }
    }
    //https://pastie.io/xlbcvy.java

    /**
     * Sortiert "quadrate" aufsteigend gemäß Bubblesort-Verfahren. Sortiert nach
     * Seitenlänge.
     */
    public static void sortiereQuadrate(Quadrat[] quadrate) {
        boolean getauscht = true;

        if (quadrate.length <= 1)
            return;

        while (getauscht) {
            getauscht = false;
            for (int i = 0; i < quadrate.length - 1; ++i) {
                if (quadrate[i].getSeitenlaenge() > quadrate[i + 1].getSeitenlaenge()) {
                    Quadrat tmp = quadrate[i];
                    quadrate[i] = quadrate[i + 1];
                    quadrate[i + 1] = tmp;
                    getauscht = true;
                }
            }
        }
    }
}
