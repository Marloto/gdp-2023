package practice.group2.examples;

public class ExamplesFromGroup2 {
    private String test;
    private String abc;

    // Content-Assist ctrl + leertaste
    // -> generiert basierend auf dem Cursor-Kontext weiteren Code
    // -> main-Methode
    // -> Konstruktor
    // -> Methodennamen anfangen und daraus Methoden generieren lassen
    // -> Aufrufe in methoden, sowie Variablen
    // -> Typische Konstrukte wie if, for, while, usw.
    // Quick-Fix ctrl + 1 / cmd + 1 zzgl. ESC um die Erzeugung zu beenden
    // -> korrektur von Fehlern, sowie Erzeugung von Strukturen
    // -> z.B. Methoden oder Attribute generieren, wenn diese fehlen
    // -> z.B. Parameter auf neue oder ex. Attribute zuweisen
    // -> Teilausdrücke markieren und in Variablen auslagern
    // Outline ctrl + o / cmd + o mit Enter bestätigen
    // Navigation über History (siehe Pfeile in Button-Leiste)
    // Links anzeigen, ctrl / cmd gedrückt zzgl. Klick zum Navigieren durch
    // Quellcode
    // Kommentare mit ctrl + 7 / cmd + 7
    // -> Toggle selektierten Teil des Codes mit Kommentaren
    // -> Hinweis es gibt auch Block-Kommentare
    // Markierung von Texten: shift + pfeiltasten zur markierung sowie Pos1 / Ende
    // GoTo-Line: ctrl + L / cmd + L
    // Duplizieren von Zeilen: ctrl + alt + Pfeil Hoch / Runter bzw. option + cmd +
    // Pfeil Hoch / Runter
    // Löschen Ctrl + D / CMD + D
    // Move-Line Alt + Pfeil Hoch / Runter
    // -> bewegt die Markierung, oder die aktuelle Zeile
    // Refactoring bezieht sich auf Änderungen im Quellcode, z.B. Umbenennung
    // -> Cursor in einen namen bewegen und rechtsklick > refactoring > rename
    // -> Shift + Alt + R / Cmd + Option + R
    // Source im Kontext Menü erlaubt zusätzliches generieren von...
    // -> Konstruktoren
    // -> später Getter / Setter
    // -> Imports
    // -> usw.
    // Formatieren Shift + Ctrl + F / Shift + Cmd + F
    // -> Praxis:

    public ExamplesFromGroup2(String test) {
        this.test = test;
        doSomething();
        int var1 = 123 / 42;
        int abc = doOtherthing() + var1;
        int otherthing = abc;
    }

    public ExamplesFromGroup2(String test, String abc) {
        this.test = test;
        this.abc = abc;
    }

    private int doOtherthing() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, World!");
        }
        return 0;
    }

    private void doSomething() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, World!");
        }
    }

    public static void main(String[] args) {
        new ExamplesFromGroup2("Test");
    }
    
    
    // git clone -> lädt alle Commits initial
    // git add -> markiert zur versionierung, fügt zur Stage
    // git commit -> zusammenpacken aller Elemente auf der Stage in einen Commit
    // git push -> Kopiert alle lokalen noch nicht hochgeladenen Commits auf
    //             einen Remote (z.B. Bitbucket)
    // git pull -> laden aller fehlenden Commits
    // git merge / rebase / reflog / stash...
}
