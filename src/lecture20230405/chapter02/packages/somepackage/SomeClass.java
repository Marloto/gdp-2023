// Name der hier verwendet wird, muss gleichzeitig der
// Ordner sein!
// -> somepackage.SomeClass 
// -> imports bietet eine kürzung / alias innerhalb der aktuellen Datei an
// -> Unterstrukturen erlaubt: somepackage.irgendwas.abc vgl somepackage/irgendwas/abc
// -> Konvention:
//   -> domain names als grundidee, in umgekehrter Reihenfole
//   -> someproject.thi.de -> de.thi.someproject.model / de.thi.someproject.controller  
//   -> Ausnahme: java. od javax. od. jakarta.
// -> wildcards: java.util.*
// -> statische Elemente importieren

package lecture20230405.chapter02.packages.somepackage;

import static lecture20230405.chapter02.packages.otherpackage.SomeClass.y;

import java.util.*;

public class SomeClass {
    public static void main(String[] args) {
        // otherpackage.SomeClass.x; <- nicht sichtbar, weil package internal
        
        // Was denken Sie passierte damals?
        // Klasse Scanner liegt im Package java.util
        // Klasse System liegt in keinem Package
        // in ist statisches Attribut an System
        Scanner scanner = new Scanner(System.in);
        y = 42; // der Zugriff auf otherpackage.SomeClass.y
    }
}
