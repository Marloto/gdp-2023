package lecture20230329.chapter02.arrays;

public class ArrayExamples {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		System.out.println(arr[0]);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		// Aufgabe: Summe und Durchschnitt von arr berechnen
		// ca. 5min
		
		float sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum = sum + arr[i];
		}
		float avg = sum / arr.length;
		System.out.println(sum);
		System.out.println(avg);
		
		for(int value : arr) {
			// hat keine Auswirkung auf das Array
			value ++;
		}
		for(int value : arr) {
			System.out.println(value);
		}
		int i = 0;
		while(i < arr.length) {
			System.out.println(arr[i]);
			i ++;
		}
		
		// <datentyp> <name>
		int[] arr2 = new int[] { 42, 21, 3 };
		for(int value : arr2) {
			System.out.println(value);
		}
		
		
		Rechteck[] rechtecke = new Rechteck[3];
		rechtecke[0] = new Rechteck(2.0);
		rechtecke[1] = new Rechteck(4.0);
		rechtecke[2] = new Rechteck(1.0);
		for(int j = 0; j < rechtecke.length; j++) {
			System.out.println(rechtecke[j]);
		}
		
		Rechteck a = rechtecke[0];
		a.breite ++;
		
		for(int j = 0; j < rechtecke.length; j++) {
			rechtecke[j].breite ++;
		}
		for(Rechteck var : rechtecke) {
			var.breite ++;
		}
		
		
		
	}
}
