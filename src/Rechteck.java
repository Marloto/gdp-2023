// Klasse: Rechteck, Fließkommazahl höhe und breite, zwei Konstruktoren zum Initialisieren der Objekte, einer mit einem Parameter und einem mit zwei
// Dazu eine Methode zum Berechnen des Flächeninhaltes



public class Rechteck {

	double hoehe;
	double breite;
	
	Rechteck(double h) {
		this(h, h);
	}
	
	Rechteck(double h, double b) {
		setSeiten(h, b);
	}
	
	// hoehe * breite
	double flaecheninhalt() {
		return hoehe * breite;
	}
	
	void setSeiten(double h) {
		setSeiten(h, h);
	}
	
	void setSeiten(double hoehe, double breite) {
		// Wenn Sie gleiche Namen haben
		// bei Variablen oder Parametern
		// kann mit der this-Referenz
		// auf das aktuell aufrufende Objekt
		// zugegriffen werden
		this.hoehe = hoehe;
		this.breite = breite;
	}
	
	void setSeiten(int h, int b) {
		setSeiten((double) h, (double) b);
	}
	
	public static void main(String[] args) {
		Rechteck r = new Rechteck(2, 4);
		r.setSeiten(1, 2);
		double d = r.flaecheninhalt();
		System.out.println(d);
		
		r = new Rechteck(8, 16);
		
		
		
		Rechteck r2 = new Rechteck(4, 8);
		double d2 = r2.flaecheninhalt();
		System.out.println(d2);
		
		r = r2;
		System.out.println(r.flaecheninhalt());
		r.setSeiten(10);
		System.out.println(r2.flaecheninhalt());
		
		Rechteck r3 = new Rechteck(4, 8);
		Rechteck r4 = new Rechteck(4, 8);
		
		if(r3.hoehe == r4.hoehe && r3.breite == r4.breite) {
			System.out.println("Inhaltlich gleich!");
		}
		
		if(r3 == r4) {
			System.out.println("Ist gleich!");
		} else {
			System.out.println("Ist nicht gleich!");
		}
		
		Rechteck r5 = new Rechteck(4, 8);
		Rechteck r6 = r5;
		
		if(r5 == r6) {
			System.out.println("Ist gleich!");
		} else {
			System.out.println("Ist nicht gleich!");
		}

		
		
		double someDouble1 = 1.23;
		double someDouble2 = 1.23;
		
		if(someDouble1 == someDouble2) {
			System.out.println("Ist gleich!");
		} else {
			System.out.println("Ist nicht gleich!");
		}
		
		//r2 = null;
		//System.out.println(r2.flaecheninhalt() + " - " + r.flaecheninhalt());
	}
	
}
