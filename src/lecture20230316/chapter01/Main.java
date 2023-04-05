package lecture20230316.chapter01;
public class Main {
  // eine Funktion könnte man aktuell wie folgt definieren
  static int ggt(int zahl1, int zahl2) {
    // ...
    return 123;
  }

  // main muss genau so definiert werden wie folgend
  public static void main(String[] args) {
    int z = ggt(4, 8);

    String someStr = "";
    String someStr2 = "Hello"; // Debugger nutzen und prüfen, was in someStr gespeichert wird
    int x = 42;
    System.out.println(someStr2 + " world!");
    System.out.println(x);
    int y = x + 1;
    System.out.println("Ergebnis: ");
    System.out.println(y);
    System.out.printf("");

    // Datentyp ist java.util.Scanner
    // Name der Variable ist scanner
    // Wert ist new java.util.Scanner(System.in)
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int x2 = scanner.nextInt();
    System.out.println("Eingabe war: " + x2);
  }
}