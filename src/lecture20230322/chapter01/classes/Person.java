public class Person {
   String name;
   String vorname;
   
   Person(String n, String v) {
	   name = n;
	   vorname = v;
   }
   
   Person(String n) {
	   name = n;
   }
   
   void sagHallo() {
	   System.out.println("Hallo, " + vorname + " " + name);
   }
   
   // Erzeugung: new Person()
   // Person peter = new Person();
	public static void main(String[] args) {
		Person peter = new Person("Musterman", "Peter");
		// Einmal aufgerufen
		// Attribute können übergeben werden
		// Kein Rückgabedatentyp -> der Typ ist die Klasse selbst, es wird ein Objekt erzeugt 
		// Muss genauso heißen wie die Klasse
		
		// .
		peter.name = "Musterman";
		peter.vorname = "Peter";
		
		// Iteration, Parameter, weitere Methode
		peter.sagHallo();
		
		Person erika = new Person("Musterfrau", "Erika");
		
		erika.vorname = "Erika";
		erika.name = "Musterfrau";
		erika.sagHallo();


		peter.sagHallo();
	}
}