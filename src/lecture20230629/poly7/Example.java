package lecture20230629.poly7;

public class Example {
	public static void main(String[] args) {
		Polyline polyline = new Polyline();
		polyline.add(0, 0);
		polyline.add(10, 0);
		polyline.add(20, 0);
		
		for(Position p : new Polyline()
				.add(0, 0)
				.add(10, 0)
				.add(20, 0)
				.scale(2)
				.stopAfter(25)) {
			System.out.println(p);
		}
	}
}



