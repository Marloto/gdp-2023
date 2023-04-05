package lecture20230322.chapter02.classes;

public class Farbe {
	byte rot;
	byte gruen;
	byte blau;
	
	// ... methods ...
	
	Farbe() {
		this((byte) -1);
	}
	
	Farbe(byte grau) {
		this(grau, grau, grau);
	}
	
	Farbe(byte r, byte g, byte b) {
		// pruefen ob sie in einem richtigen bereich sind
		//if(-128 >= rot && rot < 127) {
		//}
		rot = r;
		gruen = g;
		blau = b;
	}
	
	Farbe(byte r, byte g, double b) {
		// pruefen ob sie in einem richtigen bereich sind
		//if(-128 >= rot && rot < 127) {
		//}
		rot = r;
		gruen = g;
		blau = (byte) b;
	}
	
	public static void main(String[] args) {
		int b = 1;
		
		Farbe f = new Farbe((byte) 122, (byte) 0, b);
		
	}
}
