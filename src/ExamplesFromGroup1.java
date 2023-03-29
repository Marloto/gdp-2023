
public class ExamplesFromGroup1 {
    // Content Assist ctrl + leertaste
    // -> generiert code, basierend auf aktuellem Kontext
    // -> main für Main-Methode
    // -> Konstruktor, usw.
    // -> ESC zum ausblenden
    // -> nach einem Punkt öffnet sich Content Assist automatisch
    // Quick-Fix ctrl + 1 / cmd + 1
    // -> wenn fehler auftreten, prüfen Sie über Quick-Fix was zur
    // korrektur möglich wäre
    // Outline Overlay ctrl + o / cmd + o
    // -> Ermöglicht die Suche nach Eigenschaften
    // Links für Navigation mit Ctrl / Cmd gedrückt haltend
    // Zur Definition hüpfen mittels F3
    // Toggle Command mit Ctrl + 7 / Cmd + 7
    // GoTo Line Ctrl + L / Cmd + L
    // Delete Line mit Ctrl + D / Cmd + D
    // Move Lines mit Alt + Pfeil Hoch / Runter (unter Mac option)
    // Duplicate Line mit Alt + Ctrl + Pfeil Hoch / Runter (unter Mac option + cmd)
    // Refactoring: Shift + Alt + R / Cmd + option + R
    // -> abbruch mit ESC
    // -> bestätigen mit Enter
    // Auto Formate -> Ctrl + Shift + F / Cmd + Shift + F
    // -> Vor abgabe Dokument aufräumen!
    // -> Vorsicht in Projekten später
    // -> Git Repository z.B. hat dann zuviele unnötige Änderungen

    private String someFooVar;
    private int otherVar;

    // irgend eine sehr lange zeile, mit viel Text, die aufjedenfall umgebrochen
    // werden sollte, irgend eine sehr lange zeile, mit viel Text, die aufjedenfall
    // umgebrochen werden sollte
    public ExamplesFromGroup1() {
        int otherVar = 0;
        this.otherVar = otherVar;
        String text = "irgend eine sehr lange zeile, mit viel Text, die aufjedenfall umgebrochen werden sollte, irgend eine sehr lange zeile, mit viel Text, die aufjedenfall umgebrochen werden sollte";
        doSomething();
    }

    public ExamplesFromGroup1(String someFooVar, int otherVar) {
        super();
        this.someFooVar = someFooVar;
        this.otherVar = otherVar;
    }

    private int doSomething() {
        return otherVar;
    }

    // Was hat es mit git aufsich?
    // - clone lädt ein repository lokal auf dem Rechner
    // - git add -> platzieren auf die bühne
    // - git commit -> alles in einem commit verpacken
    // - git push -> lädt auf remote
    
}
