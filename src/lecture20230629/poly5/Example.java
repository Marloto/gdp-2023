package lecture20230629.poly5;

public class Example {
	public static void main(String[] args) {
		Polyline polyline = new Polyline();
		polyline.add(0, 0);
		polyline.add(10, 0);
		polyline.add(20, 0);
		
		for(Position p : polyline.part(15)) {
			System.out.println(p);
		}
	}
}



