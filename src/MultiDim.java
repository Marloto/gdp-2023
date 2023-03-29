public class MultiDim {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		
		int lengthDim1 = arr.length;
		int lengthDim2 = arr[0].length;
		
		for(int x = 0; x < arr.length; x ++) {
			int[] ref = arr[x];
			for(int y = 0; y < arr[x].length; y ++) {
				System.out.println(ref[y]);
			}
		}
		
		
		Rechteck[][] rechtecke = new Rechteck[2][2];
		rechtecke[0][0] = new Rechteck(1.0);
		rechtecke[0][1] = new Rechteck(2.0);
		rechtecke[1][0] = new Rechteck(3.0);
		rechtecke[1][1] = new Rechteck(4.0);
		
		// Iterationsschleife / for-each
		// for(int i : arr) { ...
		for(Rechteck[] liste : rechtecke) {
			for(Rechteck var : liste) {
				
			}
		}
	}
}
